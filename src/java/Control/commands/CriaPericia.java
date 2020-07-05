package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import Persistencia.RelatorioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CriaPericia implements Command {
  
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession sessao = request.getSession();
        PericiaDAO dao = new PericiaDAO();
        
        dao.setPericia(request.getParameter("nome"), request.getParameter("descricao"), request.getParameter("conclusao"), request.getParameter("local"));
        
        RelatorioDAO relatorioDAO = new RelatorioDAO();
        relatorioDAO.setRelatorio("Pericia Criada","ID: " + sessao.getAttribute("peritoID") + " | Nome: " + sessao.getAttribute("peritoNome"));
        
        sessao.setAttribute("mensagem", "Cadastro Salvo.");
        
        return "cadastro_pericia.jsp";
    } 
}