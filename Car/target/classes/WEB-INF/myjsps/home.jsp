<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auto Service</title>
</head>
<body>
	<div align="center">
		<%-- <h2>
			<a href='<c:url value="addCustomer"/>'>New Customer</a>
		</h2>

		<sec:authorize access="hasRole('Admin') or hasRole('Storekeeper')">
			<h2>
				<a href='<c:url value="removeCustomer"/>'>Remove Customer</a><br/><br/>
				<a href='<c:url value="addStaff"/>'>Add Staff</a>
			</h2>
		</sec:authorize>

		<sec:authorize access="hasRole('Admin')">
			<h2>
				<a href='<c:url value="removeStaff"/>'>Deactivate Staff</a><br/><br/>
				<a href='<c:url value="allusers"/>'>Get All Users</a>
			</h2>
		</sec:authorize>

		<sec:authorize access="hasRole('Customer')">
			<h2>
				<a href='<c:url value="serviceVehicle"/>'>Book Vehicle Service</a>
			</h2>
		</sec:authorize> --%>

	</div>
	<sec:csrfInput />
</body>
</html>