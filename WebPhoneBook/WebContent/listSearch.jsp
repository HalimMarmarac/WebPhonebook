<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>WebPhoneBook/contacts</title>

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

	<jsp:include page="includes/inheader.jsp"></jsp:include>

	<div class="container">
		<h3>Contact list</h3>

		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Name</th>
					<th>Last Name</th>
					<th>Phone</th>
					<th>Address</th>
					<th>Email</th>
					<th>Edit</th>
					<th>Delete</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach items="${contacts}" var="contact" varStatus="counter">
					<tr>
						<td>${counter.count}</td>
						<td>${contact.name}</td>
						<td>${contact.lastname}</td>
						<td>${contact.phone}</td>
						<td>${contact.address}</td>
						<td>${contact.email}</td>
						<td><a href="edit?id=${contact.contactId}">Edit Contact</a></td>
						<td><a href="delete?id=${contact.contactId}">Delete
								Contact</a></td>
						<td></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>