<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.classes.Calculator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello<br>

<%-- <jsp:forward page="Login.html"></jsp:forward>
 --%>
 
 <jsp:include page="Insert.html"></jsp:include>
 
 <jsp:useBean id="c1" class="com.classes.Calculator"></jsp:useBean>
  
 <%
 //Calculator c1=new Calculator();
 out.print("Cube is "+c1.cube(3));
 out.print("Cube is "+c1.cube(10));
 %>
 </body>
</html>