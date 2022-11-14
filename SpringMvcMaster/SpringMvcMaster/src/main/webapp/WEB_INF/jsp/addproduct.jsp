<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Bootstrap Example</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>
body {
	background-image: url("/img/ecommerce-gddabb2d35_1920.jpg");
	background-repeat: no-repeat, repeat;
	background-size: cover;
	position: relative;
	height: 600px;
	background-position: center;
}

form {
	margin: 5px;
	width: 500px;
}

table {
	border-collapse: separate;
	border-spacing: 0px 15px;
}

section {
	align: center;
}
</style>
<body>
	<div id="loginbox" style="margin-top: 50px;"
		class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">
					<h3>ADD Product!!</h3>
				</div>
				<div
					style="float: right; font-size: 80%; position: relative; top: -10px">
					<a href="/products/admin">Back</a>
				</div>
			</div>

			<div style="padding-top: 30px" class="panel-body">

				<div style="display: none" id="login-alert"
					class="alert alert-danger col-sm-12"></div>


				<form:form modelAttribute="newProduct" method="POST"
					enctype="multipart/form-data">

					<table>

						<tr>
							<td><spring:message code="spring.form.label.name"></spring:message></td>
							<td><form:input path="name" /></td>
							<td><form:errors path="name" cssClass="text-danger"></form:errors></td>
						</tr>
						<tr>
							<td><spring:message code="spring.form.label.category"></spring:message></td>
							<td><form:select path="category">
									<form:option value="electronics" label="Electronics" />
									<form:option value="medicine" label="Medicine" />
									<form:option value="menswear" label="MensWear" />
									<form:option value="cosmetics" label="Cosmetics" />
									<form:option value="food" label="Food" />
									<form:option value="furniture" label="Furniture" />
									<form:option value="mobiles" label="Mobile" />
									<form:option value="toys&baby" label="Toyes&Baby" />
									<form:option value="sports" label="Sports" />
									<form:option value="grocery" label="Grocery" />
									<form:option value="aplinces" label="Aplinces" />
									<form:option value="cars&bikes" label="Cars&Bikes" />
									<form:option value="home" label="Home" />
									<form:option value="fashion" label="Fashion" />
									<form:option value="personalcare" label="Personalcare" />
								</form:select></td>
						</tr>
						<tr>
							<td><spring:message code="spring.form.label.manufacturer"></spring:message></td>
							<td><form:input path="manufacturer" /></td>
						</tr>

						<tr>
							<td><spring:message code="spring.form.label.unitprice"></spring:message></td>
							<td><form:input path="unitprice" /></td>
						</tr>
						<tr>
							<td><spring:message code="spring.form.label.description"></spring:message></td>
							<td><form:textarea path="description" cols="22" rows="3" /></td>
						</tr>

						<tr>
							<td>Choose Product Image</td>
							<td><form:input path="productImage" type="file" /></td>
						</tr>

						<tr>

							<td><input type="submit" value="save" /></td>
						</tr>

					</table>
					<section style="margin-right: -40%">
						<div class="pull-left">
							<a href="?language=en">English</a>|<a href="?language=hi">Hindi</a>
						</div>
						<p style="margin-left: 60%">
							<a href="<spring:url value="/products/list"></spring:url>"
								class="btn btn-info  btn-large">ViewAll</a>

						</p>
					</section>
				</form:form>



			</div>
		</div>
	</div>
</body>

</html>



