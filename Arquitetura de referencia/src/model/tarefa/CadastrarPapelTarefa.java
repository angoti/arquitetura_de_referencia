package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.PapelDAO;
import model.javabean.Papel;

public class CadastrarPapelTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//recebe parâmetros de formulário preenchido pelo usuário
		String papel = request.getParameter("papel");
		//Cria um objeto pra ser enviado ao DAO
		Papel p = new Papel(papel);
		PapelDAO papelDAO = new PapelDAO();
		papelDAO.salvar(p);
		
		//retorna uma página jsp para ser enviada ao usuário
		return "index";
	}

}
