<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de usu�rio</title>
</head>
<body>
	<%@ include file="cabecalho.jsp"%>
	<hr>
	${msg}
	<form action="cadastrarUsuario" method="post">
		Usuario:<input name="usuario"> Senha:<input name="senha"> Nome completo: <input name="nome"> <input type="submit" value="ok">
	</form>
</body>
</html>