<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<html>
<head>
<title>Products</title>
</head>
<meta charset="ISO-8859-1">
<body>
	<h1>Products management system</h1>
	<input type="button" value="Add Product"
		onclick="window.location.href='addProduct'; return false;"
		class="btn btn-primary" />
	<br />
	<br />
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
