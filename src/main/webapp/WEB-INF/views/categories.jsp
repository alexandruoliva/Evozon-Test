<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<meta http-equiv="Cache-Control" content="no-store" />
<html>
<head>
<title>Categories of products</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<body>
	<h1>Categories</h1>
	<h3>Categories list:</h3>
	<table>
		<tr>
			<td>Category Id</td>
			<td>Category Name</td>
		</tr>
		<c:forEach items="${categories}" var="category">
			<tr>
				<td><c:out value="${category.categoryId}" /></td>
				<td><c:out value="${category.typeOfProduct}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
