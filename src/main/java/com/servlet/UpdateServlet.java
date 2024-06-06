package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String user=req.getParameter("txtuser");//admin
		String pass=req.getParameter("txtpass");//12345
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("update user set password=? where username=?");
			st.setString(1, pass);
			st.setString(2, user);
			
			st.executeUpdate();
			out.print("Updated Successfully");
			resp.sendRedirect("Login.html");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
