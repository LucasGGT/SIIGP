<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.commands;

import Control.Command;
import Model.Pericia;
import Persistencia.PericiaDAO;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mathe
 */
public class verPericia implements Command{
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PericiaDAO dao = new PericiaDAO();
        dao.getPericias(request);
        
        return "ver_pericia.jsp";
    }
    
    private Collection<Pericia> getPericia(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        Collection<Pericia> pericia = (Collection<Pericia>)sessao.getAttribute("Pericia");
        
        if(pericia == null) {
            pericia = new ArrayList<Pericia>();
            sessao.setAttribute("pericia", pericia);
        }
        
        return pericia;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.commands;

import Control.Command;
import Model.Pericia;
import Persistencia.PericiaDAO;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mathe
 */
public class verPericia implements Command{
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PericiaDAO dao = new PericiaDAO();
        dao.getPericias(request);
        
        return "ver_pericia.jsp";
    }
    
    private Collection<Pericia> getPericia(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        Collection<Pericia> pericia = (Collection<Pericia>)sessao.getAttribute("Pericia");
        
        if(pericia == null) {
            pericia = new ArrayList<Pericia>();
            sessao.setAttribute("pericia", pericia);
        }
        
        return pericia;
    }
}
>>>>>>> MatheusFrech-patch-1
