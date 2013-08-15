<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Bean Form</title>
</head>
<body>
<h1>
	Bean Form  
</h1>


<c:if test="${!enableEdit}">
	<p align="center">
	<form:form action="/mvn-spring-mvc/addBean" method="post" modelAttribute="javaBean">
		<h2>Form</h2>
		Bean Value: <form:input path="value"/><br/>
		<input type="submit" value="save">
	</form:form>
	</p>
</c:if>
<c:if test="${enableEdit}">
<p align="center">
	<form:form action="/mvn-spring-mvc/addBean" method="post" modelAttribute="javaBean">
		<h2>Form</h2>
		Bean Id: <form:input path="id" readonly="true"/><br/>
		Bean Value: <form:input path="value" readonly="true"/><br/>
	</form:form>
	</p>
</c:if>
</body>
</html>