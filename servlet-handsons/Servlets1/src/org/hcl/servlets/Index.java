package org.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Index() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Welcome to Hall Paradise</h1>");
		pw.println("<p>The type of events are</p>");
		pw.println("<ul>");
		pw.println("<li>Exhibition</li>");
		pw.println("<li>Stage Show</li>");
		pw.println("</ul>");
		pw.println("</body>");
		pw.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
