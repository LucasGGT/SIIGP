package Control;

import javax.servlet.http.HttpServletRequest;

public class CommandFactory {
    
    public static Command createCommand(HttpServletRequest req) throws Exception {
        String acao = req.getParameter("acao");
        
        if(acao == null)
            acao = "Index";
        
        acao = "Control.commands." + acao;
        
        Class<?> comando = Class.forName(acao);
        
        return (Command)comando.newInstance();
    }
    
}