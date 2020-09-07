<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auto Service</title>
<style type="text/css">
input {
	font-weight: bold;
}

td {
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Service Details</h2>
		<table>

			<tr>
				<td>Service Cost :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>Part Cost :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
					type="submit" value="Add Service Details"></td>
			</tr>

		</table>
	</div>
</body>
</html>