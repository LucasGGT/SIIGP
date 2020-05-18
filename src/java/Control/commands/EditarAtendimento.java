package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditarAtendimento implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
       AtendimentoDAO dao = new AtendimentoDAO();
 
       dao.editarAtendimento(request.getParameter("nome"), request.getParameter("date"), 
               request.getParameter("descricao"), request.getParameter("atendimentoID"));
       return "ver_atendimento.jsp";
    }
    
}
