package model.tarefa;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FabricaDeTarefaSufixo {

	static Map<String, Tarefa> tarefas = new HashMap<String, Tarefa>();
	static {
		tarefas.put("/teste", new TesteTarefa());
	}

	public static Tarefa getTarefa(HttpServletRequest request) {
		System.out.println(request.getServletPath().split("[.]")[0]);
		Tarefa tarefa = tarefas.get(request.getServletPath().split("[.]")[0]);	

		if (tarefa != null)
			return tarefa;
		else
			return new NULLTarefa();
	}
}
