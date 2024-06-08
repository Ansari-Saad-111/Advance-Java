<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>    
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<CENTER>
<H1> <font color="red">  Success</font></H1>
<UL>

  <LI>First Name:  <bean:write name="user" property="firstName"/>
                  
  <LI>Last Name:  <bean:write name="user"  property="lastName"/>
                  
  <LI>Email Address: <bean:write name="user" property="emailAddress"/>
</UL>
</CENTER>
</body>
</html>