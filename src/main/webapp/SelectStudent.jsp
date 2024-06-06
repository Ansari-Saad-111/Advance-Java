<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
<%@ include file="StudentInsert.html" %>

<table border="2">
<tr><th>Roll no.</th><th>Name</th><th>Percentage</th></tr>
<%
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
	
	PreparedStatement st=con.prepareStatement("select * from student");
	ResultSet rs=st.executeQuery();
	while(rs.next())
	{
		out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getFloat(3)+"</td></tr>");
	}
}
catch(Exception e)
{
	out.println(e.getMessage());
}
%>
</table>
</body>
</html>