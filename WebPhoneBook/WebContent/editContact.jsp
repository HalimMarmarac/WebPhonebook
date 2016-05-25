<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>WebPhoneBook/edit</title>

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

	<jsp:include page="includes/header.jsp"></jsp:include>


	<div class="container">
		<h3>Edit Contact</h3>


		<form class="form-horizontal" action="edit" method="post">

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="name" name="name"
						value="${contact.name }" />
				</div>
			</div>

			<div class="form-group">
				<label for="lastname" class="col-sm-2 control-label">Last
					Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="lastname"
						name="lastname" value="${contact.lastname}">
				</div>
			</div>

			<div class="form-group">
				<label for="phone" class="col-sm-2 control-label">Phone</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="phone" name="phone"
						value="${contact.phone}">
				</div>
			</div>

			<div class="form-group">
				<label for="address" class="col-sm-2 control-label">Address</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="address" name="address"
						value="${contact.address}">
				</div>
			</div>

			<div class="form-group">
				<label for="email" class="col-sm-2 control-label">Email</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="email" name="email"
						value="${contact.email}">
				</div>
			</div>

			<input type="hidden" name="id" value="${contact.contactId}">

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">Submit</button>
				</div>
			</div>
		</form>
	</div>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>