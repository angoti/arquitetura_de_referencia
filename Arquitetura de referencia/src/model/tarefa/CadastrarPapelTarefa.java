package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.PapelDAO;
import model.javabean.Papel;

public class CadastrarPapelTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//recebe par�metros de formul�rio preenchido pelo usu�rio
		String papel = request.getParameter("papel");
		//Cria um objeto pra ser enviado ao DAO
		Papel p = new Papel(papel);
		PapelDAO papelDAO = new PapelDAO();
		papelDAO.salvar(p);
		
		//retorna uma p�gina jsp para ser enviada ao usu�rio
		return "index";
	}

}
