<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
<%-- Comet�rio JSP --%>
<!-- Coment�rio html -->
<% String mensagem = "Bem vindo ao JSP!"; %>
<% out.println(mensagem); %><br /><br /><%-- vari�vel implicita --%>
<!-- variavel out do tipo JSPWriter que possui o metono ln -->
<!-- imprimimos utilizando scriptlet JSP -->
<h1>Seja bem vindo ao javaServer pages</h1>
<%= mensagem %><br /><br />
<!-- imprimimos utilizando express�es JSP -->
<% System.out.println("Onde sair� esta mensagem???"); %>
</body>
</html>