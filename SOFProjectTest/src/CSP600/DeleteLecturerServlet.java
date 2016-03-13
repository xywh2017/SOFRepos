
package CSP600;

import java.io.IOException;
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
@WebServlet(name = "DeleteLecturerServlet_1", urlPatterns = {"/DeleteLecturerServlet_1"})
public class DeleteLecturerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
        

		try {

			LecturerBean lecturer = new LecturerBean();
			//lecturer.setLecturerID(request.getParameter("lecturerID"));
                        lecturer.setLecturerFullname(request.getParameter("lecturerFullname"));
			//lecturer.setLecturerPassword(request.getParameter("lecturerPassword"));

			lecturer = DeleteLecturerDAO.deletelecturer(lecturer);
                        
                        

//                            int selectedItem;
//                            if(request.getParameter("lecturerFullname")!=null)
//                            {
//                               selectedItem=Integer.ParseInt(request.getParameter("lecturerFullname"));
//                            }
                        
                        response.sendRedirect("home.jsp");

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
