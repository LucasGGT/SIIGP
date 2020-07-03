package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class verAtendimento implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        AtendimentoDAO dao = new AtendimentoDAO();
        dao.getAtendimentos(request);   
        return "ver_atendimento.jsp";
    }
    
}