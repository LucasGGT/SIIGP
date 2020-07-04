package Model;

import java.util.Date;

public class Perito {
    private int id;
    private String usuario;
    private String senha;
    private String descricao;
    private Date data_nascimento;
    
    public Perito(int id,String usuario,String senha,String descricao,Date data_nascimento) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.descricao = descricao;
        this.data_nascimento = data_nascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
}
