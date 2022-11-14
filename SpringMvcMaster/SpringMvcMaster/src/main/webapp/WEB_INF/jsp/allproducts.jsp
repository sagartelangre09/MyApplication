<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="com.sagar.springmvcmaster.model.Product"%>
<%@ page import="java.util.*"%>

<html xmlns:th="www.thymeleaf.org">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">

<head>
<title>aApNnAsHopPing.com</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery-1.4.2.js">
	
</script>


<%
List<Product> products = (List<Product>) request.getAttribute("products");
%>
<style>
p.ex1 {
	margin-left: 60%;
}

.navbar {
	width: 100%;
	background-color: #555;
	overflow: auto;
}

/* Navbar links */
.navbar a {
	float: left;
	text-align: center;
	padding: 12px;
	color: white;
	text-decoration: none;
	font-size: 17px;
}

/* Navbar links on mouse-over */
.navbar a:hover {
	background-color: #000;
}

/* Current/active navbar link */
.active {
	background-color: #04AA6D;
}

@media screen and (max-width: 500px) {
	.navbar a {
		float: none;
		display: block;
	}
}

a {
	margin-left: 10px;
	margin-top: 20px;
}
</style>
</head>

<body>
	<!-- navebar start -->
	<div class="navbar">
		<a class="active" href="/normal/home"><i class="glyphicon glyphicon-home"></i>
			Logout</a>
		<%-- <p class="ex1">
		<div>
			<form th:action="@{category}" method="get">
				<select name="product" style="margin-left: 80px">
					<option value="-1"></option>
					<c:forEach items="${products}" var="product">
						<option id="category" value="${product.category}">
							${product.category}</option>
					</c:forEach>
				</select>
				<button type="submit" th:value="${category}"
					placeholder="Find by category" size="50" class="btn btn-info">Search</button>


			</form>
		</div>


		</p>

 --%>
	</div>

	<!-- navebar ends -->
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>All You Want You Get Here!!!</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
						<div class="caption">
							<div>
								<img src="<c:url value="/img/${product.name}.jpg"></c:url>"
									style="width: 100%">
							</div>
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>${product.unitprice} Rs</p>

							<span> <a
								href="<spring:url value="/products?id=${product.productId}"></spring:url>"
								class="btn btn-primary  btn-large"> <span
									class="glyphicon-eye-open glyphicon"> </span>Details
							</a>
				
								
									&nbsp;
						<a href="<spring:url value="order"></spring:url>" class="btn btn-warning btn-large"> <span
                        class="glyphicon-shopping-cart glyphicon"> </span> Order Now
                    </a>
									
							
</span>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>

</body>
</html>