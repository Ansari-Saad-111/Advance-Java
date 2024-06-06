<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String user=request.getParameter("txtuser");
String pass=request.getParameter("txtpass");
if(user.equals(pass)) {
	out.print("Login successfully");
}
else {
	out.print("Login fail");
}
%>
</body>
</html>