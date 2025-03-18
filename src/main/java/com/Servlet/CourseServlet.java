package com.Servlet;
import java.io.*;

import com.Dao.CourseDAO;
import com.entity.Course;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/course")
public class CourseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String candidateName = request.getParameter("CName");
        String courseCategory = request.getParameter("category");
        String courseName = request.getParameter("name");
        String courseDuration = request.getParameter("duration");
        String coursePrice = request.getParameter("price");

        int duration = Integer.parseInt(courseDuration);
        double price = Double.parseDouble(coursePrice);

        Course course = new Course(candidateName, courseCategory, courseName, duration, price);

        CourseDAO courseDAO = new CourseDAO();
        boolean isAdded = courseDAO.addCourse(course);
        CourseDAO.closeConnection();

        if (isAdded) {
            // Forward to success page
            request.setAttribute("course", course);
            RequestDispatcher dispatcher = request.getRequestDispatcher("courseAdded.jsp");
            dispatcher.forward(request, response);
        } else {
            // Forward to error page
            request.setAttribute("error", "Error adding the course. Please try again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }
}
