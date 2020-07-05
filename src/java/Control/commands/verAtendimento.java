package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class verAtendimento implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        AtendimentoDAO dao = new AtendimentoDAO();
        dao.getAtendimentos(request);

        HttpSession sessao = request.getSession();
        sessao.setAttribute("erro", "");
        sessao.setAttribute("mensagem", "");
        
        return "ver_atendimento.jsp";
    }
    
}