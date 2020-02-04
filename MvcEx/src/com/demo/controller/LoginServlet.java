package com.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.LoginPojo;
import com.demo.service.LoginService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// PrintWriter out = response.getWriter();
		String n1 = request.getParameter("user");

		String n2 = request.getParameter("pass");
		//RequestDispatcher requestDispatcher=null;
		//requestDispatcher = request.getRequestDispatcher("Result1.jsp");
		LoginPojo loginpojo = new LoginPojo();
		loginpojo.setUserName(n1);
		loginpojo.setPassword(n2);
		LoginService loginService = new LoginService();
		LoginPojo returnLoginPojo = loginService.validateLogin(loginpojo);

		//request.setAttribute("result", result);
		if (returnLoginPojo.getRole() == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("error", "Invalid username/password");
			requestDispatcher.forward(request, response);
		}

		/*
		 * if (n1.equals("admin") && n2.equals("admin")) {
		 * //requestDispatcher=request.getRequestDispatcher("success.html");
		 * request.setAttribute("result","success"); }
		 */
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Result.jsp");
			request.setAttribute("loginDetails", loginpojo);
			requestDispatcher.forward(request, response);
		}

	}

}
