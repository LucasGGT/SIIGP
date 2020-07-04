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
        HttpSession sessao = request.getSession();
        AtendimentoDAO dao = new AtendimentoDAO();
        
        String teste = (String)sessao.getAttribute("periciaID");
        int perito = (int)sessao.getAttribute("peritoID");
        
        dao.setAtendimento((String)sessao.getAttribute("periciaID"), perito, request.getParameter("date"), request.getParameter("descricao"));
        
        return "escolher_pericia.jsp";
    }
    
}