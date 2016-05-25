<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>WebPhoneBook/login</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom css-->
<link href="css/custom.css" rel="stylesheet">


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<jsp:include page="includes/startheader.jsp"></jsp:include>

	<div class="container-fluid">
		<img src="img/login.png" class="center-block" />
	</div>

	<!-- functionality -->
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<br> <br> <br> <br>

				<h4>Enter your username and password...</h4>
				
				<br>

				<form class="form-horizontal" id="login" action="login"
					method="post">

					<div class="form-group">
						<label for="username" class="col-sm-4 control-label">Username:
						</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" id="username"
								name="username" placeholder="Username">
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="col-sm-4 control-label">Password:</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" id="password"
								name="password" placeholder="Password">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-4 col-sm-7">
							<button type="submit" class="btn btn-success">OK</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- end row -->

	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>