<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:url value = "/products" var="productAddUrl"/>
<html>
<head>
    <title>Add new product</title>
</head>
<body>
<form:form method="POST" action="${productAddUrl}" modelAttribute="product">
    <form:label path="id">Id</form:label>  <form:input path="id"/>
    <form:label path="code">Code</form:label> <form:input path="code"/>
    <form:label path="name">Name</form:label> <form:input path="name"/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
