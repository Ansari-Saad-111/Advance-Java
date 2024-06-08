package com.struts.action;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.struts.bean.User;

public class UserAction extends Action
{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	User u1=(User)form;
	String firstName=u1.getFirstName();
	String lastName=u1.getLastName();
	String emailAddress=u1.getEmailAddress();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

		PreparedStatement st=con.prepareStatement("Insert into userbean values(?,?,?)");
		st.setString(1, firstName);
		st.setString(2, lastName);
		st.setString(3, emailAddress);
		st.executeUpdate();
		
	}
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
	return(mapping.findForward("success"));
	
	
}
}
