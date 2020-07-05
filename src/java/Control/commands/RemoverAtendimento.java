package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import Persistencia.RelatorioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoverAtendimento implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AtendimentoDAO dao = new AtendimentoDAO();
        HttpSession sessao = request.getSession();
        
        dao.removeAtendimento(request.getParameter("atendimentoID"));
        
        RelatorioDAO relatorioDAO = new RelatorioDAO();
        relatorioDAO.setRelatorio("Atendimento Removido","ID: " + sessao.getAttribute("peritoID") + " | Nome: " + sessao.getAttribute("peritoNome"));
        
        dao.getAtendimentos(request);
        
        return "ver_atendimento.jsp";
    }
    
}
