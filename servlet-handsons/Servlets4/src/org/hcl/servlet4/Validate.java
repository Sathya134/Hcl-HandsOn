package org.hcl.servlet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Validate() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<String> al=new ArrayList<String>();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name=request.getParameter("eventName");
		String hallName=request.getParameter("hallName");
		String type=request.getParameter("type");
		String details=request.getParameter("details");
		String owner=request.getParameter("owner");
		String startDate=request.getParameter("startDate");
		String endDate=request.getParameter("endDate");
		if(name.equals("")) {
	
			al.add("event name must not be empty");
		}
		if(hallName.equals("")) {
			
			al.add("event hallname must not be empty");
		}
		if(type==null) {
			
			al.add("event type must not be empty");
		}
		if(details.equals("")) {
			
			al.add("event details must not be empty");
		}
		if(owner.equals("")) {
			
			al.add("owner name must not be empty");
		}
		if(startDate.equals("")) {
			
			al.add("start date must not be empty");
		}
		if(endDate.equals("")) {
			
			al.add("end date must not be empty");
		}
		if(al.size()!=0) {
			pw.println("<div style='color:red'>"+al+"</div>");
			RequestDispatcher rd=request.getRequestDispatcher("./Index4");
			rd.include(request, response);
		}
		else {
			pw.println("<body>");
			pw.println("<h1 style='color:green'>Event Created Successfully!!!</h1>");
			pw.println("<h3>Event Details</h3>");
			pw.println("<table border='1' id='display'>");
			pw.println("<tr>");
			pw.println("<td>EventName</td><td>Hall Name</td><td>EventType</td><td>Details</td><td>Owner</td><td>StartDate</td><td>EndDate</td>");
			pw.println("</tr>");
			pw.write("<body>");
			pw.println("<td>"+name+"</td><td>"+hallName+"</td><td>"+type+"</td><td>"+details+"</td><td>"+owner+"</td><td>"+startDate+"</td><td>"+endDate+"</td>");
			pw.println("</table>");
			pw.println("</body>");
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
