<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
a {
	margin-left: 10px;
	margin-top: 20px;
}  
    </style>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Products</h1>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <div>
            <div class="col-md-5"><img src="<c:url value="/img/${products.name}.jpg"></c:url>"style="width:100%"></div>
                <h3>${products.name}</h3>
                <p>${products.description}</p>
                <p>
                    <strong>Item Code : </strong>${products.productId}
                    
                </p>
                <p>
                    <strong>manufacturer</strong> : ${products.manufacturer}
                </p>
                <p>
                    <strong>category</strong> : ${products.category}
                </p>
                
                <h4>${products.unitprice} Rs</h4>
                <span>
                    <a href="<spring:url value="products/order"></spring:url>" class="btn btn-warning btn-large"> <span
                        class="glyphicon-shopping-cart glyphicon"> </span> Order Now
                    </a>
                
                 
                    <a href="<spring:url value="products/all"></spring:url>" class="btn btn-info btn-large"> <span
                        class="glyphicon glyphicon-repeat  glyphicon"> </span>BackToAllProducts
                    </a>
             </span>
             
            </div>
        </div>
    </section>
</body>
</html>