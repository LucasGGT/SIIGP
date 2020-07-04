package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditarAtendimento implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
       HttpSession sessao = request.getSession();
       AtendimentoDAO dao = new AtendimentoDAO();
       
       dao.editarAtendimento(request.getParameter("date"), request.getParameter("descricao"),(String)sessao.getAttribute("atendimentoID"));
       dao.getAtendimentos(request);
       
       return "ver_atendimento.jsp";
    }
    
}
