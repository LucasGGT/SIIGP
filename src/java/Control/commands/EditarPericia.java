package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import Persistencia.RelatorioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditarPericia implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
       HttpSession sessao = request.getSession();
       PericiaDAO dao = new PericiaDAO();
       
       dao.editarPericia(request.getParameter("nome"), request.getParameter("descricao"), request.getParameter("conclusao"), request.getParameter("local"), (String)sessao.getAttribute("periciaID"));
       dao.getPericias(request);
            
       RelatorioDAO relatorioDAO = new RelatorioDAO();
       relatorioDAO.setRelatorio("Pericia Editada","ID: " + sessao.getAttribute("peritoID") + " | Nome: " + sessao.getAttribute("peritoNome"));
           
       
       return "ver_pericia.jsp";
    }
    
}
