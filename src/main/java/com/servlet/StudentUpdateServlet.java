package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentUpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int rollno;
		float per;
		PrintWriter out=resp.getWriter();
	    rollno=Integer.parseInt(req.getParameter("txtrollno"));
		String name=req.getParameter("txtname");
	    per=Float.parseFloat(req.getParameter("txtper"));
	    try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("update student set name=?,per=? where rollno=?");	
			st.setString(1, name);
			st.setFloat(2, per);
			st.setInt(3, rollno);

			st.executeUpdate();
			out.print("Updated Successfully");
			resp.sendRedirect("StudentInsert.html");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
