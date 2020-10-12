package org.hcl.servlets.three;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Display() {
        super();
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String Name=request.getParameter("name");
		String PhoneNumber=request.getParameter("phoneNumber");
		String Email=request.getParameter("email");
		String City=request.getParameter("city");
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>User Details </h1>");
		pw.println("<table border='1' id='display'>");
		pw.println("<tr>");
		pw.println("<td>Name</td><td>PhoneNumber</td><td>Email</td><td>City</td>");
		pw.println("</tr>");
		pw.write("<body>");
		pw.println("<td>"+Name+"</td><td>"+PhoneNumber+"</td><td>"+Email+"</td><td>"+City+"</td>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
