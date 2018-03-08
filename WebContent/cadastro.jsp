<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página de Cadastro</title>
</head>
<body>

<div align="center">
<h1>Cadastro</h1>
<form action="cadtrar.jsp" method="post">
<table>
	<tr>
		<td>Id:</td>
		<td><input name="id" id="id" /></td>
		</tr>
	<tr>
		<td>Nome:</td>
		<td><input name="nome" id="nome" /></td>
		</tr>
	<tr>
		<td>Peso:</td>
		<td><input name="peso" id="peso" /></td>
		</tr>
	<tr>
		<td>Tipo:</td>
		<td><input name="tipo" id="tipo" /></td>
		</tr>
	<tr>
		<td>Data de Cadastro:</td>
		<td><input name="datacadatro" id="datacadatro" /></td>
		</tr>
	<tr>
		<td>Valor:</td>
		<td><input name="valor" id="valor" /></td>
		</tr>	
	</table>

	</form>
</div>

</body>
</html>