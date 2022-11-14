<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html xmlns:th="www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
 <form th:action="@{/products/}" method="get">
 
    
 
<select name="product" style="margin-left: 80px">
				<option value="-1"></option>
				<c:forEach items="${products}" var="product">
					<option id="category" value="${product.category}">
						${product.category}</option>
				</c:forEach>
				</select>
  <button type="submit" th:value="${category}"placeholder="Find by category" size="50" class="btn btn-info" >Search</button>
				
			
</form>
</div>

</body>
</html>