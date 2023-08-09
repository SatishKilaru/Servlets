package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Sample Servlet - GET Method";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";

		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "<li><b>First Name</b>: " + request.getParameter("first_name") + "</li>\n" + "<li><b>Last Name</b>: "
				+ request.getParameter("last_name") + "</li>\n" + "</ul>\n" + "</body>\n" + "</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response); // Treat POST requests like GET requests
	}
}
