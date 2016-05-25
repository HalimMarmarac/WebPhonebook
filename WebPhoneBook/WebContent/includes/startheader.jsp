<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp"><img
				src="img/contacts.jpg" /></a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<h1>
					<strong>WEB PhoneBook</strong>
				</h1>
			</ul>
			<div class="navbar-form navbar-right">
				<form action="indexServlet" method="get">
					<button type="submit" class="btn btn-default btn-large index"
						name="submit" value="login">Log In</button>
					<button type="submit" class="btn btn-primary btn-large index"
						name="submit" value="register">Register</button>
				</form>
			</div>
		</div>
	</div>
</nav>
