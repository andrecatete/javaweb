<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pojo.jsp</title>
</head>
<body>
<jsp:useBean id="cliente" class=modelo.Cliente></jsp:useBean>
${cliente.nome} <!--para o getClientes.jsp-->
</body>
</html>