<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auto Service</title>
<style type="text/css">
a{
text-decoration: none;
}
</style>
</head>
<body>
	<div align="center">
		<h2 align="center">
			<c:if test="${param.error != null}">
				<font color="red" size="5">Invalid username or password.</font>
			</c:if>
			<c:if test="${param.logout != null}">
				<font color="green" size="5">You have logout successfully</font>
			</c:if>
		</h2>
	</div>

	<div align="center">
		<form name='loginForm' action="<c:url value='/login'/>" method="post">
			<table>
				<tr>
					<td align="center" colspan="2">
						<h2>User Login Form</h2>
					</td>
				</tr>
				<tr>
					<td>Username :</td>
					<td><input type='text' name='username' ></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td align="center" colspan="2">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<input type="submit" value="Login">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<div align="center">
	<h2><b> <a href='<c:url value="/addCustomer"/>'>New User Register here</a></b></h2>
	</div>
</body>
</html>