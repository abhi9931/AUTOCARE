<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
 <style>
a{
text-decoration: none;
}
/* .collapsible {
  background-color: #777;
  color: white;
  cursor: pointer;
  padding: 18px;
  width: 15%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
}

.active, .collapsible:hover {
  background-color: #555;
}

.content {
  padding: 0 18px;
  max-height: 0;
  overflow: hidden;
  width : 12.3%;
  transition: max-height 0.2s ease-out;
  background-color: #99ffff;
} */
h2{
}
</style> 
<meta charset="UTF-8">
<title>Auto Service</title>
</head>
<body>
<h2>
			<a href='<c:url value="addCustomer"/>'>New Customer</a>
		</h2>

		<sec:authorize access="hasRole('Admin') or hasRole('Storekeeper') or hasRole('Staff')">
			<h2>
				<%-- <a href='<c:url value="removeCustomer"/>'>Remove Customer</a><br/><br/> --%>
				<a href='<c:url value="part"/>'>Part</a></br></br>
			<!-- 	<a href='<c:url value="serviceDetails"/>'>Service Details</a></br></br> -->
				<a href='<c:url value="serviceNames"/>'>Services</a></br></br>
				<a href='<c:url value="worksheetItems"/>'>Worksheet</a></br></br>
				<a href='<c:url value="addStaff"/>'>Add Staff</a>
			</h2>
		</sec:authorize>

		<sec:authorize access="hasRole('Admin')">
			<h2>
				<%-- <a href='<c:url value="removeStaff"/>'>Deactivate Staff</a><br/><br/> --%>
				<a href='<c:url value="allusers"/>'>Get All Users</a>
			</h2>
		</sec:authorize>

		<sec:authorize access="hasRole('Customer')">
			<h2>
				<a href='<c:url value="bookService"/>'>Book  Service</a></br></br>
				<a href='<c:url value="addCar"/>'>Add Car</a>
			</h2>
		</sec:authorize>
<%-- <button class="collapsible">Admin Console</button>
<div class="content">
  <a href='<c:url value="removeCustomer"/>'>Remove Customer</a><br/><br/>
				<a href='<c:url value="addStaff"/>'>Add Staff</a>
</div>
<button class="collapsible">Open Section 1</button>
<div class="content">
  <p>Hello Guys</p>
</div>
<button class="collapsible">Open Section 2</button>
<div class="content">
  <p>Hello Guys.</p>
</div>
<button class="collapsible">Open Section 3</button>
<div class="content">
  <p>Hello Guys.</p>
</div>
<!-- 
<script>
var coll = document.getElementsByClassName("collapsible");
var i;

for (i = 0; i < coll.length; i++) {
  coll[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var content = this.nextElementSibling;
    if (content.style.maxHeight){
      content.style.maxHeight = null;
    } else {
      content.style.maxHeight = content.scrollHeight + "px";
    } 
  });
}
</script> --> --%>
</body>
</html>