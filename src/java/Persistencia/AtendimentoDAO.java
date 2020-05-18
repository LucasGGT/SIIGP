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

public class AtendimentoDAO {
    public void getAtendimentos(HttpServletRequest request) throws Exception {       
        String sql = "select * from atendimento;";
        
        PreparedStatement st = criaStatement(sql);
        ResultSet res = st.executeQuery();
        
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        
        while(res.next()) {
            int id = res.getInt("id");
            String nome = res.getString("perito");
            Date data = res.getDate("data");
            String desc = res.getString("descricao");
            
            atendimentos.add(new Atendimento(id, nome, data, desc));
        }
         
        st.getConnection().close();
        st.close();
        
        HttpSession sessao = request.getSession();
        sessao.setAttribute("atendimentos", atendimentos);
    }
 
    public void setAtendimento(String perito, String data, String descricao) throws Exception {
        String sql = "insert into atendimento(perito, data, descricao) values(?, ?, ?)";       
                
        PreparedStatement st = criaStatement(sql);
        st.setString(1, perito);
        st.setString(2, data);
        st.setString(3, descricao);

        st.execute();

        st.getConnection().close();
        st.close();       
    }
    
    public void verAtendimento(HttpServletRequest request) throws Exception{
        String sql = "select * from atendimento;";
        PreparedStatement st = criaStatement(sql);
        ResultSet res = st.executeQuery();
        
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        
        while(res.next()) {
            int id = res.getInt("id");
            String perito = res.getString("perito");
            Date data = res.getDate("data");
            String descricao = res.getString("descricao");
           
            atendimentos.add(new Atendimento(id, perito, data, descricao));
        }
         
        st.getConnection().close();
        st.close();
        
        HttpSession sessao = request.getSession();
        sessao.setAttribute("Atendido", atendimentos);
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
