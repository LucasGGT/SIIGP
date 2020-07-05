package Persistencia;


import Model.Pericia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class PericiaDAO {
    public void getPericias(HttpServletRequest request) throws Exception {       
        String sql = "select * from pericia;";
        PreparedStatement st = criaStatement(sql);
        ResultSet res = st.executeQuery();
        
        List<Pericia> pericias = new ArrayList<Pericia>();
        
        while(res.next()) {
            int id = res.getInt("id");
            String nome = res.getString("nome");
            String descricao = res.getString("descricao");
            String conclusao = res.getString("conclusao");
            String local = res.getString("local");
           
            pericias.add(new Pericia(id, nome, descricao, conclusao, local));
        }
         
        st.getConnection().close();
        st.close();
        
        HttpSession sessao = request.getSession();
        sessao.setAttribute("Pericias", pericias);
    }
 
    public int countPericia() throws Exception {
       String sql = "select count(id) as variavel from pericia";       
                
        PreparedStatement st = criaStatement(sql);
        
        ResultSet res = st.executeQuery();
        res.next();
        
        return res.getInt("variavel");
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
    
        public void editarPericia(String nome, String descricao, String conclusao, String local, String id) throws Exception {  
        String sql = "UPDATE pericia SET nome = ?, descricao = ?, conclusao = ?, local = ? WHERE id = ? ";             
        PreparedStatement st = criaStatement(sql);
        st.setString(1, nome);
        st.setString(2, descricao);
        st.setString(3, conclusao);
        st.setString(4, local);
        st.setString(5, id);
        
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
