package Persistencia;

import Model.Atendimento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class PericiaDAO {
    public void getPericias() throws Exception {       
        //Implementar
    }
 
    public void setPericia(String nome, String descricao, String conclusao, String local) throws Exception {
        String sql = "insert into pericia(nome, descricao, conclusao, local) values(?, ?, ?, ?)";       
                
        PreparedStatement st = criaStatement(sql);
        st.setString(1, nome);
        st.setString(2, descricao);
        st.setString(3, conclusao);
        st.setString(4, local);

        st.execute();

        st.getConnection().close();
        st.close();       
    }
    
    private PreparedStatement criaStatement(String sql) throws Exception {
        String url = "jdbc:mysql://localhost/sgp";
        String user = "root";
        String pass = "";
         
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, user, pass);
        
        return con.prepareStatement(sql);
    }
}
