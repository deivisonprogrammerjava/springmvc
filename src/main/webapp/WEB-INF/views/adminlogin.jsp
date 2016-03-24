<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Deivison Programmer :: Login</title>
		<link rel="stylesheet"	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
		<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h2>Login :: Admin</h2>

		<form role="form">
			<div class="form-group">
				<label for="email">Usuario:</label> 
				<input type="user"	class="form-control" name="user" placeholder="Usuario" required="true">
			</div>
			<div class="form-group">
				<label for="pwd">Senha:</label> 
				<input type="password" class="form-control" name="password" placeholder="Senha">
			</div>
			<div class="checkbox">
				<label><input type="checkbox">Lembrar</label>
			</div>
			<button type="submit" class="btn btn-default">Acessar</button>
		</form>
	</div>
	</body>
</html>
