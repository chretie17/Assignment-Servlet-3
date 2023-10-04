package com.studentadmission;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resetPasswordServlet")
public class ResetPassword extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");

        String resetToken = generateRandomToken();

        sendPasswordResetEmail(email, resetToken);


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Password reset instructions sent to your email.</h2>");
        out.println("<p>Please check your email and follow the instructions to reset your password.</p>");
        out.println("</body></html>");
    }

    private String generateRandomToken() {

        return "randomToken123";
    }


    private void sendPasswordResetEmail(String email, String resetToken) {

        System.out.println("Sending reset email to " + email);
        System.out.println("Reset link: http://yourwebsite.com/reset?token=" + resetToken);
    }
}
