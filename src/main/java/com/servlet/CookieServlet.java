package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String user=req.getParameter("txtuser");
		String pass=req.getParameter("txtpass");

		System.out.println("service");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("select * from user where username=? and password=?");
			st.setString(1, user);
			st.setString(2, pass);
			
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				out.print("Login Successfully");
				Cookie c1=new Cookie("user",user);//add cookie to browser
				Cookie c2=new Cookie("pass",pass);
				resp.addCookie(c1);
				resp.addCookie(c2);
				out.print(" Cookie Created");
			}
			else {
				out.print("Login Fail");
				resp.sendRedirect("Login.html");
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
