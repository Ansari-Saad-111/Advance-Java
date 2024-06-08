package com.struts.action;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.bean.User;

public class LoginWithDatabase extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//String user=request.getParameter("user");
		//String pass=request.getParameter("pass");
		User u1=(User)form;
		String user=u1.getUser();
		String pass=u1.getPass();
		String ans="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

			PreparedStatement st=con.prepareStatement("select * from user where username=? and password=?");
			st.setString(1, user);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				ans="success";
			}
			else
			{
				ans="failure";
			}

		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return(mapping.findForward(ans));

	}
}
