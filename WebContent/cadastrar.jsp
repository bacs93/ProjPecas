<%@ page import="br.com.projpecas.dados.CadastroDB"%>
<%@ page import= "br.com.projpecas.entidade.Cadastro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar</title>
</head>
<body>
	<%
String nome = request.getParameter("nome");
double peso = Double.parseDouble(request.getParameter("peso"));
String tipo = request.getParameter("tipo");
int data_de_cadastro  =  Integer.parseInt(request.getParameter("data_de_cadastro"));
float valor = Float.parseFloat(request.getParameter("valor"));

Cadastro cadastro = new Cadastro();

cadastro.setNome(nome);
cadastro.setPeso(peso);
cadastro.setTipo(tipo);
cadastro.setData_de_cadastro(data_de_cadastro);
cadastro.setValor(valor);

if (new CadastroDB().inserir(cadastro)){
%>

	REGISTRO INSERIDO!
		<%}%>

</body>
</html>