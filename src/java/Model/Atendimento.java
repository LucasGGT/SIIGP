package Model;

import java.util.Date;

public class Atendimento {
    private int id;
    private int pericia_id;
    private String perito;
    private Date data;
    private String descricao;
    
    public Atendimento(int id,int pericia_id, String p, Date data, String descricao) {
        this.id = id;
        this.pericia_id = pericia_id;
        this.perito = p;
        this.data = data;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getPericia_id() {
        return pericia_id;
    }
    
    public void setPericia_id(int pericia_id) {
        this.pericia_id = pericia_id;
    }
    
    public String getPerito() {
        return perito;
    }

    public void setPerito(String perito) {
        this.perito = perito;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
