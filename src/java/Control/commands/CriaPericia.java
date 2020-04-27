package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CriaPericia implements Command {
  
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PericiaDAO dao = new PericiaDAO();
        
        dao.setPericia(request.getParameter("nome"), request.getParameter("descricao"), 
                request.getParameter("conclusao"), request.getParameter("local"));
        
        return "cadastro_pericia.jsp";
    }
    
}