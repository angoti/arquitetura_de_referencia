package model.tarefa;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FabricaDeTarefa {

	static Map<String, Tarefa> tarefas = new HashMap<String, Tarefa>();
	static {
		tarefas.put("POST/login", new LoginTarefa());
		tarefas.put("GET/logout", new LogoutTarefa());
		tarefas.put("GET/exibeFormCadastroUsuario", new ExibeFormCadastroUsuarioTarefa());
		tarefas.put("POST/cadastrarUsuario", new CadastrarUsuarioTarefa());
		tarefas.put("GET/listarTodos", new ListarTodosTarefa());
		Tarefa t = new AtualizaUsuarioTarefa();
		tarefas.put("GET/atualizar", t);
		tarefas.put("POST/atualizar", t);
		tarefas.put("GET/excluir", new ExcluirUsuarioTarefa());
		tarefas.put("POST/cadastrarPapel", new CadastrarPapelTarefa());
		tarefas.put("GET/exibeFormCadastroPapel", new ExibeFormCadastroPapelTarefa());
	}

	public static Tarefa getTarefa(HttpServletRequest request) {
		System.out.println(request.getMethod() + request.getPathInfo());
		Tarefa tarefa = tarefas.get(request.getMethod() + request.getPathInfo());	

		if (tarefa != null)
			return tarefa;
		else
			return new NULLTarefa();
	}
}
