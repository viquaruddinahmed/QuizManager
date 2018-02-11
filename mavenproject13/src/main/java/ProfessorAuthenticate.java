
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author viquar
 */
public class ProfessorAuthenticate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        
            	final String login = request.getParameter("firstName");
		final String password = request.getParameter("password");
		
		final HttpSession session = request.getSession();
	
         if ("thomas".equals(login)&&"123456".equals(password)) {
			// then we are authenticated, we can move to the create question page
			session.setAttribute("authenticated", true);
			request.getRequestDispatcher("Select.jsp").forward(request, response);
			


		} else {
			request.getRequestDispatcher("ProfessorLogin.jsp").forward(request, response);
			
			session.setAttribute("authenticated", false);
		}
            
            
            
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
