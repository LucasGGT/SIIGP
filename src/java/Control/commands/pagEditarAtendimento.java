/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.commands;

import Control.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 6833381
 */
public class pagEditarAtendimento implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {     
        
        HttpSession sessao = request.getSession();
        sessao.setAttribute("atendimentoID", request.getParameter("atendimentoID"));   
        return "editar_atendimento.jsp";
    }
    
}
