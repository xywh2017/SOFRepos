/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "UpdateLecturer1", urlPatterns = {"/UpdateLecturer1"})
public class UpdateLecturer1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
        

		try {

			LecturerBean lecturer = new LecturerBean();
			lecturer.setLecturerID(request.getParameter("lecturerID"));
                        lecturer.setLecturerFullname(request.getParameter("lecturerFullname"));
			lecturer.setLecturerPassword(request.getParameter("lecturerPassword"));

			lecturer = UpdateLecturerDAO.updatelecturer(lecturer);
                        
                        response.sendRedirect("homeLecturer.jsp");

			//if (lecturer.isValid()) {

				//HttpSession session = request.getSession(true);
				//session.setAttribute("currentSessionUser", lecturer);
				//response.sendRedirect("home.jsp"); // logged-in page
			//}

			//else
				//response.sendRedirect("invalidLogin.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
    }
