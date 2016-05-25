<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>WebPhoneBook/home</title>

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

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<!-- functionality -->
	<div class="container">
		<!-- Actionable items -->
		<div class="row">
			<div class="col-md-4">
				<img src="icons/listusers.png" class="center-block"
					alt="list contacts"/>
				<h2 class="text-center">List Contacts</h2>
				<p>Show all contacts in your contact list.</p>
				<br>
				<p>
					<a class="btn btn-warning btn-block" href="listContacts"
						role="button">List Contacts</a>
				</p>
			</div>
			<div class="col-md-4">
				<img src="icons/adduser.png" class="center-block"
					alt="add contacts"/>
				<h2 class="text-center">Add Contact</h2>
				<p>Add new contact to your contact list.</p>
				<br>
				<p>
					<a class="btn btn-warning btn-block" href="addContact.jsp"
						role="button">Add Contact</a>
				</p>
			</div>
			<div class="col-md-4">
				<img src="icons/searchuser.png" class="center-block"
					alt="search contacts"/>
				<h2 class="text-center">Search Contacts</h2>
				<p>Search for specific contact in your contact list.</p>
				<br>
				<p>
					<a class="btn btn-warning btn-block" href="searchContacts.jsp"
						role="button">Search Contacts</a>
				</p>
			</div>
		</div>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>

</body>
</html>