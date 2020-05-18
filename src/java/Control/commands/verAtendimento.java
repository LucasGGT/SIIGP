<<<<<<< HEAD
package Control.commands;

import Control.Command;
import Model.Atendimento;
import Persistencia.AtendimentoDAO;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class verAtendimento implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        AtendimentoDAO dao = new AtendimentoDAO();
        dao.getAtendimentos(request);
        
        return "ver_atendimento.jsp";
    }
    
    private Collection<Atendimento> getAtendimento(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        Collection<Atendimento> atendimento = (Collection<Atendimento>)sessao.getAttribute("atendimento");
        
        if(atendimento == null) {
            atendimento = new ArrayList<Atendimento>();
            sessao.setAttribute("atendimento", atendimento);
        }
        
        return atendimento;
    }
    
}
=======
package Control.commands;

import Control.Command;
import Model.Atendimento;
import Persistencia.AtendimentoDAO;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class verAtendimento implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        AtendimentoDAO dao = new AtendimentoDAO();
        dao.getAtendimentos(request);
        
        return "ver_atendimento.jsp";
    }
    
    private Collection<Atendimento> getAtendimento(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        Collection<Atendimento> atendimento = (Collection<Atendimento>)sessao.getAttribute("atendimento");
        
        if(atendimento == null) {
            atendimento = new ArrayList<Atendimento>();
            sessao.setAttribute("atendimento", atendimento);
        }
        
        return atendimento;
    }
    
}
>>>>>>> MatheusFrech-patch-1
