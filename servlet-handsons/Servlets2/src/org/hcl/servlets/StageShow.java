package org.hcl.servlets.two;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StageShow")
public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StageShow() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>New Year Eve</h1>");
		pw.println("<table border='1' id='stageShow'>");
		pw.println("<tr>");
		pw.println("<th>Name<td>New Year Eve</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>HallName<td>PVR Lulu Mall</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Date<td>10-10-2020</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>StartTime<td>10:00:00</td></th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>EndTime<td>12:00:00</td></th>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
