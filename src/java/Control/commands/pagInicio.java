package Control.commands;

import Control.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class pagInicio implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession sessao = request.getSession();
        sessao.setAttribute("erro", "");
        sessao.setAttribute("mensagem", "");
        return "inicio.jsp";
    }
    
}
