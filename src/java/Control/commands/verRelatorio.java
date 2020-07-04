/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.commands;

import Control.Command;
import Persistencia.RelatorioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 6833381
 */
public class verRelatorio implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RelatorioDAO dao = new RelatorioDAO();
        dao.getRelatorio(request);
        return "ver_relatorio.jsp";
    }
    
}
