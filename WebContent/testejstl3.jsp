<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>testejstl.jsp</title>
</head>
<body>
<table>
	<c:forEach var="cliente" items="${clientes}">
		<tr>
			<td>${cliente.nome }</td>
			<td>
				<c:if test="${not empty cliente.email}">
					<a href="mailto:${cliente.email}">${cliente.email }</a>
				</c:if>
				<c:if test="${empty cliente.email}">
					E-mail nao informado
				</c:if>
			</td>
			<td>${cliente.endereco }</td>
			<td><a href="mvc?regra=RegraDeleteClientes&id=${cliente.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>