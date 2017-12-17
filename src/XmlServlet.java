

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//pw.println("Response from XML Servlet!");
		System.out.println("XML response rendered!");
		String user = request.getParameter("username");
		pw.println("Welcome! from GET method " + user);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//pw.println("Response from XML Servlet!");
		System.out.println("XML response rendered!");
		String userfirst = request.getParameter("userfirst");
		String userlast = request.getParameter("userlast");
		String Prof = request.getParameter("Prof");
		String loc = request.getParameter("location");
		pw.println("Welcome! from POST method " + userfirst + " " + userlast + " You are a " + Prof);
		pw.println("You live in: " + loc);
		
	}

}
