<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<meta http-equiv="Cache-Control" content="no-store" />
<html>
<head>
<title>Products</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<body>
	<h1>Products management system</h1>
	<input type="button" value="Add Product"
		onclick="window.location.href='addProduct'; return false;"
		class="btn btn-primary" />
	<br />
	<br />
	<input type="button" value="Find product by id"
		onclick="window.location.href='findProduct'; return false;"
		class="btn btn-primary" />
		<br>
	<h3>Products list:</h3>
	<table>
		<tr>
			<td>Product Id</td>
			<td>Product Code</td>
			<td>Product Name</td>
			<td>Creation Date</td>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td><c:out value="${product.id}" /></td>
				<td><c:out value="${product.code}" /></td>
				<td><c:out value="${product.name}" /></td>
				<td><c:out value="${product.creationDate}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
