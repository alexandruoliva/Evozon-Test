<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<c:url value="/products" var="productAddUrl" />
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
		<br></br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
