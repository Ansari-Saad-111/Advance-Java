<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H1>Login Page</H1>
	<FORM ACTION="Login.do" METHOD="post">
	
		Email address: <INPUT TYPE="TEXT" NAME="user"><BR>
		Password: <INPUT TYPE="PASSWORD" NAME="pass"><BR> 
		<INPUT TYPE="SUBMIT" VALUE="Login">
	</FORM>
<a href="Insert.jsp">Create new User</a>
</body>
</html>