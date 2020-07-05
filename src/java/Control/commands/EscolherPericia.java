
package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EscolherPericia implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession sessao = request.getSession();  
        PericiaDAO dao = new PericiaDAO();
        
        if(dao.countPericia() != 0){
            sessao.setAttribute("erro", "");
            dao.getPericias(request);
            return "escolher_pericia.jsp";
        }
        else{ 
            sessao.setAttribute("erro", "Para cadastrar um atendimento é preciso pelo menos uma perícia registrada.");
            return "cadastro_pericia.jsp";
        }
    }
}
