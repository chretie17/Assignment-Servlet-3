package com.studentadmission;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupServlet")
public class Signup extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user inputs from the signup form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Perform user registration (you can add your registration logic here)
        if (isValidRegistration(email, password)) {
            // Registration successful, redirect to admission.jsp
            response.sendRedirect("login.jsp");
        } else {
            // Registration failed, redirect to login.jsp with an error parameter
            response.sendRedirect("login.jsp?registrationError=1");
        }
    }

    private boolean isValidRegistration(String email, String password) {
        // Replace this with your actual registration logic
        // In a real application, add user data to a secure database
        // For demonstration purposes, we're using a simple condition
        return !email.isEmpty() && !password.isEmpty();
    }

    // Other methods
}
