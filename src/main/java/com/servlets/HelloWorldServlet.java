package com.servlets;

import java.io.*;

import javax.servlet.*;

public class HelloWorldServlet extends GenericServlet { // Override init(),destroy() and many methods

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlets World</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
