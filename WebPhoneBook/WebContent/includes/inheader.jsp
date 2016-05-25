<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="welcome.jsp"><img alt="Web PhoneBook"
				src="img/contacts.jpg" /></a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<h1>
					<strong>WEB PhoneBook</strong>
				</h1>
				<li><a href="welcome.jsp">Home</a></li>
				<li><a href="listContacts">List all contacts</a></li>
				<li><a href="addContact.jsp">Add new contact</a></li>
				<li><a href="searchContacts.jsp">Search</a></li>
			</ul>
			<p class="navbar-text navbar-right">
				Signed in as: <b>${user.username}</b>
			</p>
			<div class="navbar-form navbar-right">
				<form action="logout" method="get">
					<button type="submit" class="btn btn-danger btn-large index"
						name="submit" value="login">Log Out</button>
				</form>
			</div>
		</div>
	</div>
</nav>
