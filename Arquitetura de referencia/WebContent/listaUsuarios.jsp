<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar todos</title>
</head>
<body>
	<%@ include file="cabecalho.jsp" %>
	<hr>
	<table border=1>
		<thead>
			<th>Nome</th>
			<th>Usuario</th>
			<th>Senha</th>
			<th>Ações</th>
		</thead>
		<tbody>
			<c:forEach var="u" items="${usuarios}">
				<tr>
					<td>${u.nome}</td>
					<td>${u.nomeUsuario}</td>
					<td>${u.senha}</td>
					<td><a href="atualizar?id=${u.id}">Atualizar</a><a href="excluir?id=${u.id}">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>






