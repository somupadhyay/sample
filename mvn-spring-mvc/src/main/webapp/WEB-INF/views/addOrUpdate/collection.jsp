<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>User Form</title>
</head>
<body>
<h1>
	User Form  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test="${enableEdit}">
	<p align="center">
	<form:form action="/mongo/addUser" method="post" modelAttribute="user">
		<h2>Form</h2>
		First Name: <form:input path="fristName"/><br/>
		Last Name: <form:input path="lastName" /><br/>
		<%-- Interests <form:select path="interests"><br/>
			<form:options itemValue="football" items="football,chess"></form:options>
		</form:select><br/>
 --%>		<input type="submit" value="save">
		<%-- <form:button name="submit" value="save"  /> --%>
	</form:form>
	</p>
</c:if>
<c:if test="${!enableEdit}">
<p align="center">
	<form:form action="/mongo/addUser" method="post" modelAttribute="user">
		<h2>Form</h2>
		User Id: <form:input path="id" readonly="true"/><br/>
		First Name: <form:input path="fristName" readonly="true"/><br/>
		Last Name: <form:input path="lastName"  readonly="true"/><br/>
	<%-- 	Interests <form:select path="interests"><br/>
			<form:options itemValue="football" items="football,chess"></form:options>
		</form:select><br/>
		 --%>

	</form:form>
	</p>
</c:if>
</body>
</html>