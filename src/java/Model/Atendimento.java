package Model;

import java.util.Date;

public class Atendimento {
    private int codigo;
    private String perito;
    private Date dataCadastro;
    private String descricao;
    
    public Atendimento(int id, String p, Date data, String descricao) {
        this.codigo = id;
        this.perito = p;
        this.dataCadastro = data;
        this.descricao = descricao;
    }
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int id) {
        this.codigo = id;
    }
    
    public String getPerito() {
        return perito;
    }

    public void setPerito(String perito) {
        this.perito = perito;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
