<a href="/index.jsp">Home</a>
<h1>Arquitetura de refer�ncia</h1>
<hr>
<c:choose>
	<c:when test="${usuario != NULL}">
		<h1>Ol� ${usuario.nome}</h1>
		<a href="/sistema/logout">Logout</a>
		<a href="/sistema/exibeFormCadastroUsuario">Cadastrar novo usu�rio</a>
		<a href="/sistema/listarTodos">Listar todos</a>
		<a href="/sistema/exibeFormCadastroPapel">Cadastrar papel</a>
	</c:when>

	<c:otherwise>
		<c:if test="${erro != NULL}">${erro}</c:if>

		<form action="/sistema/login" method="post">
			Usuario:<input name="usuario"> Senha:<input name="senha"> <input type="submit" value="ok">
		</form>
	</c:otherwise>
</c:choose>
