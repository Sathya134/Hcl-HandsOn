package org.hcl.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index4")
public class Index4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Index4() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<h1 style='color:green'>Event Creation</h1>");
		pw.println("<body>");
		pw.println("<form action='./Validate' method='Post'>");
		pw.println("Event Name :<input type='text' name='eventName'><br>");
		pw.println("Hall Name :<input type='text' name='hallName'><br>");
		pw.println("Event Type :<input type='radio' name='type'>Exhibition <br><input type='radio' name='type'>Stage Show <br>");
		pw.println("Details :<input type='text' name='details'><br>");
		pw.println("Owner :<input type='text' name='owner'><br>");
		pw.println("Start Date :<input type='text' name='startDate'><br>");
		pw.println("End Date :<input type='text' name='endDate'><br>");
		pw.println("<input type='Submit' name='submit' value='Create' id='submit'>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
