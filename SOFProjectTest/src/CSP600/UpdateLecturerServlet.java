/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
//@WebServlet(name = "AddLecturerServlet", urlPatterns = {"/AddLecturerServlet"})
public class UpdateLecturerServlet extends HttpServlet {
    
    SelectLecturerDAO selectlecturer = new SelectLecturerDAO();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
        
        
        
      List<LecturerBean> lecturerFullname = selectlecturer.getLecturers();
      request.setAttribute("lecturerFullname",lecturerFullname); 
      RequestDispatcher view = getServletContext().getRequestDispatcher("/home.jsp");
      view.forward(request,response);

   }
    
        

//		try {
//                    
//                    
//                   String lecturerFullname = request.getParameter("LecturerFullname"); 
//                   // System.out.println("abc");
//                   //// LecturerBean lecturer = new LecturerBean(); 
//                  //  lecturer.setLecturerFullname(lecturerFullname);
//                   // request.setAttribute("LecturerFullname",lecturerFullname); 
//                   request.setAttribute("LecturerFullname",lecturerFullname);
//
//                    RequestDispatcher view = getServletContext().getRequestDispatcher("/updateLecturer.jsp"); 
//                    view.forward(request,response);
//
//			//LecturerBean lecturer = new LecturerBean();
//			//lecturer.setLecturerID(request.getParameter("lecturerID"));
//                        //lecturer.setLecturerFullname(request.getAttribute("LecturerFullname",lecturer));
//			//lecturer.setLecturerPassword(request.getParameter("lecturerPassword"));
//
//			//lecturer = AddLecturerDAO.addlecturer(lecturer);
//                        
//                        //response.sendRedirect("updateLecturer.jsp");
//
//			//if (lecturer.isValid()) {
//
//				//HttpSession session = request.getSession(true);
//				//session.setAttribute("currentSessionUser", lecturer);
//				//response.sendRedirect("home.jsp"); // logged-in page
//			//}
//
//			//else
//				//response.sendRedirect("invalidLogin.jsp"); // error page
//		}
//
//		catch (Throwable theException) {
//			System.out.println(theException);
//		}
	}

    

