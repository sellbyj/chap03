package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellServlet2
 */
@WebServlet("/Hello2")
public class Hello2Servlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("HelloServlet2.doGet()..........");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		response.setContentType("text/html ; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<titel>HelloServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
		out.println("<h1><a href =http://localhost:8080/Hell> http://localhost:8080/Hell</h1>");
		out.println("<h1><a href =http://localhost:8080/deptList.jsp> http://localhost:8080/deptList.jsp</h1>");
		out.println("<h1><a href =http://localhost:8080/variable.jsp> http://localhost:8080/variable.jsp</h1>");
		
		out.println("</div>");

		out.println("</body>");
		out.println("</html>");
	
	}


}
