<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualizar</title>
</head>
<body>
	<%@ include file="cabecalho.jsp"%>
	<hr>
	<c:if test="${!empty usuario }">
		<form action="atualizar" method="POST">
			<input type="hidden" name="id" value="${entidade.id}"> Usuario:<input name="usuario" value="${entidade.nomeUsuario}"> Senha:<input name="senha" value="${entidade.senha}"> Nome completo: <input name="nome"
				value="${entidade.nome}"> <input type="submit" value="Atualizar">
		</form>
	</c:if>
</body>
</html>