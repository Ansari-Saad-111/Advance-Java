package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetSessionServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		String user=(String) session.getAttribute("user");
		String pass=(String) session.getAttribute("pass");
        out.print("Hello user "+user);
        out.print(session.getId());
        
        out.print("<form action='LogoutServlet'>");
        out.print("<input type='submit' value='Logout'>");
        out.print("</form>");
	}
}
