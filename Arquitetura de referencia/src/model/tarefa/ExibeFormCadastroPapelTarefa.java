package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExibeFormCadastroPapelTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return "cadastroPapel";
	}

}
