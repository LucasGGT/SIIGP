package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import Persistencia.RelatorioDAO;
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
       
               
       RelatorioDAO relatorioDAO = new RelatorioDAO();
       relatorioDAO.setRelatorio("Atendimento Editado","ID: " + sessao.getAttribute("peritoID") + " | Nome: " + sessao.getAttribute("peritoNome"));
           
       
       return "ver_atendimento.jsp";
    }
    
}
