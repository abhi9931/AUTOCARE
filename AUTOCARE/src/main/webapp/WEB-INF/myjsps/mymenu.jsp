<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<h3 align="right" style="margin-top: 2px; text-decoration: none;">
<a href='<c:url value="home"/>'>Home</a>

<sec:authorize access="!isAuthenticated()">
| <a href='<c:url value="login"/>'>Login</a>
| <a href='<c:url value="addCustomer"/>'>Register Here</a>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
| Welcome : ${pageContext.request.userPrincipal.name}
| <a href = '<c:url value="logout"/>'>Logout</a>
</sec:authorize>
</h3>