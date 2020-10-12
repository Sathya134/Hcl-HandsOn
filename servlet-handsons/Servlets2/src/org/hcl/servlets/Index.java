package org.hcl.servlets.two;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Index1")
public class Index1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Index1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Welcome to Popular Paradise</h1>");
		pw.println("<a href='./Exhibition'>Exhibition</a><br>");
		pw.println("<a href='./StageShow'>StageShow</a>");
		pw.println("</body>");
		pw.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
