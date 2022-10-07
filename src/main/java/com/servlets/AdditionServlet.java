package com.servlets;

import java.io.*;

import javax.servlet.*;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		if (request.getParameter("number1") != null && request.getParameter("number2") != null) {

			long num1 = Long.parseLong(request.getParameter("number1")); // BY default it will be string
			long num2 = Long.parseLong(request.getParameter("number2"));

			PrintWriter out = response.getWriter();

			out.println("The Sum is " + (num1 + num2));
		}

	}

}
