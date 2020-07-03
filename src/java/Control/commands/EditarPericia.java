package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditarPericia implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
       HttpSession sessao = request.getSession();
       PericiaDAO dao = new PericiaDAO();
       
       dao.editarPericia(request.getParameter("nome"), request.getParameter("descricao"), 
                request.getParameter("conclusao"), request.getParameter("local"), (String)sessao.getAttribute("periciaID"));
       dao.getPericias(request);
       
       return "ver_pericia.jsp";
    }
    
}
