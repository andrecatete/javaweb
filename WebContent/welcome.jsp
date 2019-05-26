<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
<%-- Cometário JSP --%>
<!-- Comentário html -->
<% String mensagem = "Bem vindo ao JSP!"; %>
<% out.println(mensagem); %><br /><br /><%-- variável implicita --%>
<!-- variavel out do tipo JSPWriter que possui o metono ln -->
<!-- imprimimos utilizando scriptlet JSP -->
<h1>Seja bem vindo ao javaServer pages</h1>
<%= mensagem %><br /><br />
<!-- imprimimos utilizando expressões JSP -->
<% System.out.println("Onde sairá esta mensagem???"); %>
</body>
</html>