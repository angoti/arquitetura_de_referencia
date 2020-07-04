package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TesteTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("realizando a tarefa teste");
		return "teste";
	}

}
