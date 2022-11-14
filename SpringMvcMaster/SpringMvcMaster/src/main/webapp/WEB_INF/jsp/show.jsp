<%@page import="org.hibernate.validator.constraints.Length"%>
<%@page import="com.sagar.springmvcmaster.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
html, body {
	width: 90%;
	margin: auto;
	background-color: #FAEBD7;
}
a {
	margin-left: 60%;
	margin-right: 0%;
	margin-top: 10%
}

tr td {
	background-color: #EEDDEE;
}

tr.odd td {
	background-color: #EEEEDD;
}
input
{
background-color:red
}

</style>

</head>
<body>

	<b style="margin-left:60%"><h3>All Available Products</h3> </b> <br>
	<br>
	<%
	List<Product> products = (List<Product>) request.getAttribute("product");
	%>
	
				<table border="5" width="100%" align="center">

		<tr>
			<th>PRODUCT_Id</th>
			<th>CATEGORY</th>
			<th>DISCRIPTION</th>
			<th>NAME_Of_PRODUCT</th>
			<th>MANUFACTURER</th>
			<th>UNITPRICE</th>
			<th>DELETE</th>

		</tr>
		<c:forEach var="m" items="${products}" varStatus="status">
			<tr class="${status.index%2==0 ? 'even':'odd'}">
				<td><c:out value="${m.productId}"></c:out></td>
				<td><c:out value="${m.category}"></c:out></td>
				<td><c:out value="${m.description}"></c:out></td>
				<td><c:out value="${m.name}"></c:out></td>
				<td><c:out value="${m.manufacturer}"></c:out></td>
				<td><c:out value="${m.unitprice}"></c:out></td>
				<!-- <td><input type="submit" value="remove"></td>  -->
			<td><a href="/products/delete?id=${m.productId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>