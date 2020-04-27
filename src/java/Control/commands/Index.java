package Control.commands;

import Control.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "index.jsp";
    }
    
}
