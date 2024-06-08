<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="org.hibernate.*,org.hibernate.cfg.Configuration"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="u1" class="com.bean.User"></jsp:useBean>


	<jsp:setProperty property="*" name="u1" />

	<%
	Session ses = new Configuration().configure().buildSessionFactory().openSession();

	Transaction t = ses.beginTransaction();
	t.begin();
	ses.persist(u1);

	t.commit();
	ses.close();
	out.print("You are successfully registered");
	//response.sendRedirect("index.jsp");
	%>
	<a href="index.jsp">Home</a>

</body>
</html>