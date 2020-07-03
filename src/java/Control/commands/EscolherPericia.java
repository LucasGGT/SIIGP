
package Control.commands;

import Control.Command;
import Persistencia.PericiaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EscolherPericia implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PericiaDAO dao = new PericiaDAO();
        dao.getPericias(request);
            
        return "escolher_pericia.jsp";
    }
}
