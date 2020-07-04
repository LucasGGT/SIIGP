package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        try {
            Command comando = CommandFactory.createCommand(request);           
            String view = comando.execute(request, response);
            request.getRequestDispatcher(view).forward(request, response);
        }
        catch(Exception e) {
            throw new ServletException(e);
        }
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        try {
            Command comando = CommandFactory.createCommand(request);
            String view = comando.execute(request, response);
            request.getRequestDispatcher(view).forward(request, response);
        }
        catch (Exception e) {
            throw new ServletException(e);
        }
    }
}