package com.Servlet;
import java.io.*;
import java.util.List;

import com.Dao.CourseDAO;
import com.entity.Course;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ViewCoursesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CourseDAO courseDAO = new CourseDAO();
        List<Course> courses = courseDAO.getAllCourses();
        CourseDAO.closeConnection();

        // Set the courses list as a request attribute to display in the JSP
        request.setAttribute("courses", courses);
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewCourses.jsp");
        dispatcher.forward(request, response);
    }
}
