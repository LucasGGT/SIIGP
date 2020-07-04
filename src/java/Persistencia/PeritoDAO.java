package Persistencia;

import Model.Perito;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class PeritoDAO {
    public Perito getConta(String usuario_p, String senha_p) throws Exception {       
        String sql = "select * from perito where usuario = '" + usuario_p + "' and senha = '" + senha_p + "';";
        
        PreparedStatement st = criaStatement(sql);
        ResultSet res = st.executeQuery();
        
        Perito conta = null;
        
        while(res.next()) {
            int id = res.getInt("id");
            String usuario = res.getString("usuario");
            String senha = res.getString("senha");
            String descricao = res.getString("descricao");
            Date data_nascimento = res.getDate("data_nascimento");
            
            conta = new Perito(id, usuario, senha, descricao, data_nascimento);
        }
        
        st.getConnection().close();
        st.close();
        
        return conta;
    }
    
    public boolean usuarioExistente(String usuario) throws Exception {
       String sql = "select count(id) as existe from perito where usuario = ?;";       
                
        PreparedStatement st = criaStatement(sql);
        st.setString(1, usuario);
        
        ResultSet res = st.executeQuery();
        
        return res.next() && res.getInt("existe") == 1;
    }
    
    
    public void criaConta(String usuario,String senha,String descricao,String data_nascimento) throws Exception {  
        String sql = "insert into perito(usuario, senha, descricao, data_nascimento) values (?, ?, ?, ?)";               
        
        PreparedStatement st = criaStatement(sql);
        
        st.setString(1, usuario);
        st.setString(2, senha);
        st.setString(3, descricao);
        
        if("".equals(data_nascimento))
            st.setNull(4,0);
        else
            st.setString(4, data_nascimento);
        
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
