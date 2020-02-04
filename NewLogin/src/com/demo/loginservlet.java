package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String s1 = request.getParameter("user");
		String s2 = request.getParameter("pass");
		PrintWriter out = response.getWriter();

		if (s1.equals("admin") && s2.equals("admin")) {
			out.print("login success");
		} else {
			out.print("login failed");
		}
	}

}
