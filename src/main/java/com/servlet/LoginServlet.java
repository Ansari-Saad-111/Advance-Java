package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		String user=req.getParameter("txtuser");//admin
		String pass=req.getParameter("txtpass");//12345
		PrintWriter out=resp.getWriter();
		if(user.equals(pass)) {
			out.print("Login successfully");
		}
		else {
			out.print("Login fail");
		}
	}
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
