package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String user=req.getParameter("txtuser");//admin
		String pass=req.getParameter("txtpass");//12345
		
		System.out.println("service");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("insert into user values(?,?)");
			st.setString(1, user);
			st.setString(2, pass);
			
			st.executeUpdate();
			out.print("Sign-up Successfully");
			resp.sendRedirect("Login.html");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
