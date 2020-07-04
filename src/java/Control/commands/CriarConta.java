package Control.commands;

import Control.Command;
import Persistencia.PeritoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CriarConta implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PeritoDAO peritoDAO = new PeritoDAO();
        HttpSession sessao = request.getSession();
         
        if(peritoDAO.usuarioExistente(request.getParameter("usuario")) == false){
        
            peritoDAO.criaConta(request.getParameter("usuario"), request.getParameter("senha"),request.getParameter("nome"), 
                                request.getParameter("descricao"), request.getParameter("data_nascimento"));
            
            sessao.setAttribute("erro", ""); 
            return "index.jsp";
        }
        else{
            sessao.setAttribute("erro", "Usuario Existente");
            return "criar_conta.jsp";
        }
    }
    
}
