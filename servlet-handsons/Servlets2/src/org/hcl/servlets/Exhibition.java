package org.hcl.servlets.two;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exhibition")
public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Exhibition() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>TextFair 2018 expo</h1>");
		pw.println("<table border='1' id='exhibition'>");
		pw.println("<tr>");
		pw.println("<th>Name<td>TextFair 2018 expo</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>HallName<td>PVR Superplex</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>StartDate<td>10-10-2020</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>EndDate<td>10-10-2020</td></th>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
