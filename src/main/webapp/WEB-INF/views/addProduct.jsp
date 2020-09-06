<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<c:url value="/products" var="productAddUrl" />
<html>
<head>
<title>Add new product</title>
</head>
<body>
	<h1>Add new product</h1>
	<form:form method="POST" action="saveProduct" modelAttribute="product">
		<!--<form:label path="id">Id</form:label>  <form:input path="id"/>-->
		<form:label path="code">Code</form:label>
		<form:input path="code" />
		<br></br>
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
