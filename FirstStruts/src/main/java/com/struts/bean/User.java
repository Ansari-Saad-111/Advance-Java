package com.struts.bean;

import org.apache.struts.action.ActionForm;

public class User extends ActionForm
{
	private String user,pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
