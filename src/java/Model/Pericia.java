package Model;

public class Pericia {
    private int id;
    private String nome;
    private String descricao;
    private String conclusao;
    private String local;
   
    
    public Pericia(int id, String nome, String conclusao, String local, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.conclusao = conclusao;
        this.local = local;
        
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
