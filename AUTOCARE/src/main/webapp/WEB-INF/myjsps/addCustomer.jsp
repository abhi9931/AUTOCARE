<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auto Service</title>
</head>
<body>
	<div align="center">
		<form:form action="registerCustomer" method="post" modelAttribute="MyCustomer">
			<table>
				<tr>
					<td align="center" colspan="2">
						<h2>Customer Registration Form</h2>
					</td>
				</tr>
				<tr>
					<td>Full Name :</td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name" /></td>
				</tr>
				<tr>
					<td>Username :</td>
					<td><form:input path="username" /></td>
					<td><form:errors path="username" /></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password" /></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" /></td>
				</tr>
				<tr>
					<td>Phone :</td>
					<td><form:input path="phone" /></td>
					<td><form:errors path="phone" /></td>
				</tr>
				<tr>
					<td>Address :</td>
					<td><form:input path="address" /></td>
					<td><form:errors path="address" /></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
						type="submit" value="Register"></td>
				</tr>
			</table>
		</form:form>
	</div>

	<div align="center">
		<h2>
			<b><a href='<c:url value="/login"/>'>Already registered <br />Login
					here</a></b>
		</h2>
	</div>
</body>
</html>