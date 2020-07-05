package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import Persistencia.RelatorioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoverPericia implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PericiaDAO dao = new PericiaDAO();
        HttpSession sessao = request.getSession();
        
        dao.removePericia(request.getParameter("periciaID"));
        
        RelatorioDAO relatorioDAO = new RelatorioDAO();
        relatorioDAO.setRelatorio("Pericia Removida","ID: " + sessao.getAttribute("periciaID") + " | Nome: " + sessao.getAttribute("peritoNome"));
          
        dao.getPericias(request);
        
        return "ver_pericia.jsp";
    }
    
}
