package com.struts.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.bean.User;

public class InsertAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		User u1=(User)form;
		String user=u1.getUser();
		String pass=u1.getPass();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

			PreparedStatement st=con.prepareStatement("insert into user values(?,?)");
			st.setString(1, user);
			st.setString(2, pass);
			st.executeUpdate();
		}

		catch (Exception e) 
		{
             System.out.println(e.getMessage());
		}
		return(mapping.findForward("success"));
	}
}
