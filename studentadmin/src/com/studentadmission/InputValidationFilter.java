package com.studentadmission;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/register")
public class InputValidationFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phone");
        String dateOfBirth = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String course = request.getParameter("course");
        String semester = request.getParameter("semester");
        String photo = request.getParameter("photo");
        String certificate = request.getParameter("certificate");

        // Perform input validation here
        boolean isValid = validateInputs(firstName, lastName, email, phoneNumber, dateOfBirth, gender, address, course, semester, photo, certificate);

        if (isValid) {
            // If input is valid, continue the request-response chain
            chain.doFilter(request, response);
        } else {
            // If input is invalid, forward to an error page
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    private boolean validateInputs(String firstName, String lastName, String email, String phoneNumber,
                                    String dateOfBirth, String gender, String address, String course,
                                    String semester, String photo, String certificate) {
        // Implement your input validation logic here
        // Return true if all inputs are valid; otherwise, return false
        // You can check for required fields, valid email format, phone number format, etc.
        // If any validation fails, return false, and forward to an error page.
        return true; // Replace with your validation logic
    }

    public void init(FilterConfig fConfig) throws ServletException {
        // Initialization code if needed
    }

    public void destroy() {
        // Cleanup code if needed
    }
}
