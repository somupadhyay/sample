<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <title>Home Page</title>
  </head>
<body>
<div id="content">
<h1>Home Page</h1>
<p>
</p>
<p>Go to <a href="<c:url value="/home" />" > Home</a> page.
<p>Go to <a href="<c:url value="/addBean" />" > add Bean</a> page.
<p>Go to <a href="<c:url value="/home" />" > add Collection</a> page.
<p>Go to <a href="<c:url value="/home" />" > list Collection</a> page.
<p>Go to <a href="<c:url value="/home" />" > list Bean</a> page.
</p>
</div>
</body>
</html>
