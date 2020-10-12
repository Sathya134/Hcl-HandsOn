package org.hcl.servlets.three;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Index2")
public class Index2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Index2() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>User Details</h1>");
		pw.println("<form action='./Display' method='Post'>");
		pw.println("Name :<input type='text' name='name'>");
		pw.println("PhoneNumber :<input type='text' name='phoneNumber'>");
		pw.println("Email :<input type='text' name='email'>");
		pw.println("City :<input type='text' name='city'>");
		pw.println("<input type='Submit' name='submit' value='Submit' id='submit'>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
