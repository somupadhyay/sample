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
	
	<form:form action="/mongo/addUser" method="post" modelAttribute="user">
		<h2>Form</h2>
		<form:input path="fristName"/><br/>
		<form:input path="lastName" /><br/>
		<form:select path="interests"><br/>
			<form:options itemValue="football"></form:options>
		</form:select><br/>
		<form:button name="submit" value="save" />
	</form:form>
</c:if>

</body>
</html>
