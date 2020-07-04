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
        String sql = "select * from atendimento where perito_id = ?;";
        
        HttpSession sessao = request.getSession();
        PreparedStatement st = criaStatement(sql);
        
        st.setInt(1, (int)sessao.getAttribute("peritoID"));
        
        ResultSet res = st.executeQuery();
        
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        
        while(res.next()) {
            int id = res.getInt("id");
            int pericia_id = res.getInt("pericia_id");
            int perito_id = res.getInt("perito_id");
            Date data = res.getDate("data");
            String desc = res.getString("descricao");
            
            atendimentos.add(new Atendimento(id, pericia_id, perito_id, data, desc));
        }
         
        st.getConnection().close();
        st.close();
        
        sessao.setAttribute("Atendimentos", atendimentos);
    }
 
    public void setAtendimento(String pericia_id,int perito_id, String data, String descricao) throws Exception {
        String sql = "insert into atendimento(pericia_id, perito_id, data, descricao) values(?, ?, ?, ?)";       
                
        PreparedStatement st = criaStatement(sql);
        st.setString(1, pericia_id);
        st.setInt(2, perito_id);
        st.setString(3, data);
        st.setString(4, descricao);

        st.execute();

        st.getConnection().close();
        st.close();       
    }
    
    
    public void editarAtendimento(String data, String descricao, String id) throws Exception {
        String sql = "UPDATE atendimento SET data = ?, descricao = ? WHERE id = ? ";     
        PreparedStatement st = criaStatement(sql);
        st.setString(1, data);
        st.setString(2, descricao);
        st.setString(3, id);

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
