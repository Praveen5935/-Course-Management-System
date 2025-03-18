package com.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.entity.Course;

public class CourseDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/course_academy"; // Adjust with your DB URL
    private static final String USER = "root";  // Your DB username
    private static final String PASSWORD = "password";  // Your DB password
    private static Connection conn;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL JDBC driver
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addCourse(Course course) {
        String sql = "INSERT INTO courses (candidate_name, category, course_name, duration, price) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, course.getCandidateName());
            stmt.setString(2, course.getCategory());
            stmt.setString(3, course.getCourseName());
            stmt.setInt(4, course.getDuration());
            stmt.setDouble(5, course.getPrice());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to get all courses from the database
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Course course = new Course(
                        rs.getString("candidate_name"),
                        rs.getString("category"),
                        rs.getString("course_name"),
                        rs.getInt("duration"),
                        rs.getDouble("price")
                );
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
