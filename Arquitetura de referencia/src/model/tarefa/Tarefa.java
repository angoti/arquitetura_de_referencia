package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {
	    public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
