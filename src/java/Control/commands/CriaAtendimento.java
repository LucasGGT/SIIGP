package Control.commands;

import Control.Command;
import Persistencia.AtendimentoDAO;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class CriaAtendimento implements Command {
  
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AtendimentoDAO dao = new AtendimentoDAO();
 
        dao.setAtendimento(request.getParameter("nome"), request.getParameter("date"), request.getParameter("descricao"));
        
        return "cadastro_atendimento.jsp";
    }
    
}