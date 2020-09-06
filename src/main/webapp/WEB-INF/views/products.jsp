<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Products</title>
</head>
<body>

	<table>
		<tr>
			<td>Product Id</td>
			<td>Product Code</td>
			<td>Product Name</td>
			<!-- <td> Creation Date </td> -->
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td><c:out value="${product.id}" /></td>
				<td><c:out value="${product.code}" /></td>
				<td><c:out value="${product.name}" /></td>
				<!--     <td> ${product.creationDate} </td> -->
			</tr>
		</c:forEach>
	</table>
</body>
</html>
