/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginLecturerServlet extends HttpServlet {

        @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {

			LecturerBean lecturer = new LecturerBean();
			lecturer.setLecturerID(request.getParameter("lecturerID"));
			lecturer.setLecturerPassword(request.getParameter("lecturerPassword"));

			lecturer = LecturerDAO.lecturerlogin(lecturer);

			if (lecturer.isValid()) {

				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", lecturer);
				response.sendRedirect("homeLecturer.jsp"); // logged-in page
			}

			else
				response.sendRedirect("invalidLogin.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}