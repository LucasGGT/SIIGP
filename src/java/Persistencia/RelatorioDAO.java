package Persistencia;

import Model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RelatorioDAO {
 
    public void getRelatorio(HttpServletRequest request) throws Exception {       
        String sql = "select * from relatorio";
        
        PreparedStatement st = criaStatement(sql);
        
        ResultSet res = st.executeQuery();
        
        List<Relatorio> relatorios = new ArrayList<Relatorio>();
        
        while(res.next()) {
            int id = res.getInt("id");
            Timestamp timestamp = res.getTimestamp("timestamp");
            String acao = res.getString("acao");
            String informacao = res.getString("informacao");
            
            relatorios.add(new Relatorio(id, timestamp, acao, informacao));
        }
         
        st.getConnection().close();
        st.close();
        
        HttpSession sessao = request.getSession();
        sessao.setAttribute("Relatorios", relatorios);
    }
    
    public void setRelatorio(String acao, String informacao) throws Exception {
        String sql = "insert into relatorio(timestamp, acao, informacao) values( current_timestamp(), ?, ?)";       
                
        PreparedStatement st = criaStatement(sql);
        st.setString(1, acao);
        st.setString(2, informacao);

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
