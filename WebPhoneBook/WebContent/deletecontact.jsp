<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>delete-warning</title>

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
		<h3>Delete contact</h3>
		<br>
		<p>Are you sure you want to delete ${contact.name}
			${contact.lastname}?</p>

		<br> <br>

		<form class="form-horizontal" action="delete" method="post">

			<input type="hidden" class="form-control" id="name" name="name"
				value="${contact.name }" /> <input type="hidden"
				class="form-control" id="lastname" name="lastname"
				value="${contact.lastname}"> <input type="hidden"
				class="form-control" id="phone" name="phone"
				value="${contact.phone}"> <input type="hidden"
				class="form-control" id="address" name="address"
				value="${contact.address}"> <input type="hidden"
				class="form-control" id="email" name="email"
				value="${contact.email}"> <input type="hidden" name="id"
				value="${contact.contactId}"> <input type="submit"
				class="btn btn-warning" value="Delete contact">

		</form>
	</div>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>