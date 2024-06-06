<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int a=10;
int cube(int n){
	return (n*n*n);
}
%>
<%
out.print(a);
int c=cube(5);
out.print("<br>Cube is "+c);
out.print("<br>Cube is "+cube(10));
%>
<%= 10+20%>
<%= a%>
<%-- <%= cube(3)%>
 --%>
 </body>
</html>