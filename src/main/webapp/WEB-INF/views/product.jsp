<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<html>
<head>
<title>Product</title>
</head>
<body>
	<table>
		<tr>
			<td>Product Id</td>
			<td>Product Code</td>
			<td>Product Name</td>
			<td>Creation Date</td>
		</tr>
		<tr>
			<td>${product.id}</td>
			<td>${product.code}</td>
			<td>${product.name}</td>
			<td>${product.creationDate}</td>
		</tr>
	</table>
</body>
</html>
