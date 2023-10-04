package com.studentadmission;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "register", urlPatterns = { "/register" })
public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

        HttpSession session = request.getSession();

        request.setAttribute("gettedFirstName", firstName);
        request.setAttribute("gettedLastName", lastName);
        request.setAttribute("gettedEmail", email);
        request.setAttribute("gettedPhoneNumber", phoneNumber);
        request.setAttribute("gettedDateOfBirth", dateOfBirth);
        request.setAttribute("gettedGender", gender);
        request.setAttribute("gettedAddress", address);
        request.setAttribute("gettedCourse", course);
        request.setAttribute("gettedSemester", semester);
        request.setAttribute("gettedPhoto", photo);
        request.setAttribute("gettedCertificate", certificate);

        Email emailSender = new Email();
        emailSender.sendConfirmationEmail(email);

        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
