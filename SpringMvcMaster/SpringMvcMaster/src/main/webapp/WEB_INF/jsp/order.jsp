<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>

body {
	background-image: url("/img/order.jpg");
	background-repeat: no-repeat, repeat;
	background-size: cover;
	position: relative;
	height: 500px;
	width:400px;
	background-position: center;
}
form { 
margin: 0 auto; 
width:250px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	
	<form action="saveuser" >
		<h1>please enter your address</h1>
			<div>
				<label>Name</label> <input type="text" name="name"
					placeholder="Enter full name">
			</div>
			<br>
			<div class="form-group col-md-6">
				<label>Mobile</label> <input type="text" name="mobile"
					placeholder="enter mob number">
			</div>
			<br>
		
		<div>
			<label>Address</label> <input type="text" name="address"
				placeholder="1234 Main St">
		</div>
		<br>
		<div class="form-group">
			<label>Address 2</label> <input type="text" name="address2"
				placeholder="Apartment, studio, or floor">
		</div>
<br>
		<div>
			<div>
				<label>City</label> <input type="text" name="city"
					placeholder="city">
			</div>
			<br>
			<div>
				<label>State</label>
				<input type="text" name="state">
				
			</div>
			<br>
			<div>
				<label>Zip</label> <input type="text" name="zip">
			</div>
			<br>
		
		<!-- alert functionality on click button  -->
		<!-- <button type="submit" onclick="myFunction()" class="btn btn-primary">Confirm&PAY</button> -->

		<script>
			function myFunction() {
				alert("Congratsss! Your Order is Success");
			}
		</script>
 <a href="<spring:url value="all"></spring:url>" onclick="myFunction()" class="btn btn-info btn-large"> <span
                        class="glyphicon glyphicon-thumbs-up"> </span>Confirm&PAY
                    </a>

	</form>
</body>
</html>