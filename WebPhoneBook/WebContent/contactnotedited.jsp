<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>edit-error</title>

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
		<h3>Contact Not edited!</h3>

		<p>Contact has not been successfully edited. Please make sure that
			you leave no fields blank.</p>
		<br /> <a href="listContacts" class="btn btn-primary">Edit
			another contact</a> <a href="listContacts" class="btn btn-primary">List
			all contacts</a>

	</div>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>