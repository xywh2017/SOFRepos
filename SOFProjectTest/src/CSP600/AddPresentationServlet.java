/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "AddPresentationServlet", urlPatterns = {"/addPresentation"})
public class AddPresentationServlet extends HttpServlet {
     public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
    	          
         String[] presentationDay = request.getParameterValues("presentationDay");  
         String[] presentationStart = request.getParameterValues("presentationStart"); 
         String[] presentationEnd =  request.getParameterValues("presentationEnd");
         

		try {
			
			for (int i = 0; i < presentationDay.length; i++) {
				
              PresentationBean presentation = new PresentationBean();
              
              presentation.setPresentationDay(presentationDay[i]);
              presentation.setPresentationStart(presentationStart[i]);
              presentation.setPresentationEnd(presentationEnd[i]);
              System.out.println(presentation);
              
              //presentation = AddPresentationDAO.addpresentation(presentation);
				
			}
                                                                


  
                                
//                                out.println("I am an alert box!");
                                
                                response.sendRedirect("addPresentation.jsp");

		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

}
