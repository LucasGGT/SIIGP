package Control.commands;

import Control.Command;
import Model.Perito;
import Persistencia.PeritoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logar implements Command {
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PeritoDAO peritoDAO = new PeritoDAO();       
        Perito conta = peritoDAO.getConta(request.getParameter("usuario"), request.getParameter("senha"));
       
        HttpSession sessao = request.getSession();   
        
        if(conta != null) {
            
            if(request.getAttribute("logado") == null){
                sessao.setAttribute("logado", true);
                sessao.setAttribute("peritoID", conta.getId());
                sessao.setAttribute("conta", conta);
                
                sessao.setAttribute("erro", "");
                
                return "inicio.jsp";
            }
            
        }
        
        sessao.setAttribute("erro", "Usuário ou Senha inválidos");
        
        return "index.jsp";
    }   
}