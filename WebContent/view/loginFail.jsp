<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login Fail</title>
</head>
<body>
	<h1>${customer.id }logged fail</h1>
	Your ID is not existed or 
	Your password is not correct.<br />
	please try again.
	<p>
		<a href="/helloMVC/index.jsp">go to home page</a>
	</p>

</body>
</html>