package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
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
			
			PreparedStatement st=con.prepareStatement("insert into student values(?,?,?)");
			st.setInt(1, rollno);
			st.setString(2, name);
			st.setFloat(3, per);

			st.executeUpdate();
			out.print("Inserted Successfully");
			resp.sendRedirect("SelectStudent.jsp");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
