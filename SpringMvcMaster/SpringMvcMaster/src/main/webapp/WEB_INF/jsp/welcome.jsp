<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<style>
html, body {
	width: 500px;
	margin: auto;
	background-color: #FAEBD7;
}

.container {
	width: 500px;
	margin: 20px auto;
}

.preview {
	padding: 10px;
	position: relative;
}

.preview i {
	color: white;
	font-size: 35px;
	transform: translate(50px, 130px);
}

.preview-img {
	border-radius: 100%;
	box-shadow: 0px 0px 5px 2px rgba(0, 0, 0, 0.7);
}

.browse-button {
	width: 200px;
	height: 200px;
	border-radius: 100%;
	position: absolute;
	/* Tweak the position property if the element seems to be unfit */
	top: 10px;
	left: 132px;
	background: linear-gradient(180deg, transparent, black);
	opacity: 0;
	transition: 0.3s ease;
}

.browse-button:hover {
	opacity: 1;
}

.browse-input {
	width: 200px;
	height: 200px;
	border-radius: 100%;
	transform: translate(-1px, -26px);
	opacity: 0;
}

.form-group {
	width: 250px;
	margin: 10px auto;
}

.form-group input {
	transition: 0.3s linear;
}

.form-group input:focus {
	border: 1px solid crimson;
	box-shadow: 0 0 0 0;
}

.Error {
	color: crimson;
	font-size: 13px;
}

.Back {
	font-size: 25px;
}
div.input
{
text-align: center;
}
if{
  color: #00ff00;
}

</style>
</head>
<body>

	<div class="container">
		<div class="Back">
			<i class="fa fa-arrow-left" onclick="Back()"></i>
		</div>
		<form action="admin" method="get">
			<div class="preview text-center">
				<img class="preview-img"
					src="http://simpleicon.com/wp-content/uploads/account.png"
					alt="Preview Image" width="200" height="200" /> <span
					class="Error"></span>
				<p class="h2 text-center">Login Here..!</p>
			</div>
			<div class="Error">
<% if(request.getAttribute("massege")!=null)
	out.print(request.getAttribute("massege"));
	%>
	</div>
			<div class="form-group">
				<label>USERNAME:</label> <input class="form-control" type="text"
					name="username" required placeholder="Enter Your username" /> <span
					class="Error"></span>
			</div>

			<div class="form-group">
				<label>Password:</label> <input class="form-control" type="password"
					name="password" required placeholder="Enter Password" /> <span
					class="Error"></span>
			</div>

			<div class="form-group " >
				<input  class="btn btn-primary btn-block " type="submit"
					value="LogIn" />
			</div>
		</form>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>