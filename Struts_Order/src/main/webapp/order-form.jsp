<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<CENTER>

		<html:errors />

		<html:form action="/order"
			onsubmit="return validateOrderFormBean(this);">
		
		
  First name: <html:text property="firstName" />
			<BR>
  Last name: <html:text property="lastName" />
			<BR>
  Mailing address: <html:text property="address" />
			<BR>
  ZIP Code: <html:text property="zipCode" />
			<BR>
  Credit Card Number: 
  <html:text property="creditCardNumber" />
			<BR>
			<!-- 16 digit no ex.4111111111111111 -->
  Email address for confirmation: 
  <html:text property="email" />
			<BR>
			<html:submit value="Order Now!" />
		</html:form>
		<html:javascript formName="orderFormBean" />
	</CENTER>
</body>
</html>