package Model;

public class Pericia {
    private String perito;
    private String codigo;
    private String conclusao;
    private String local;
    private String descricao;
    
    public Pericia(String perito, String codigo, String conclusao, String local, String descricao) {
        this.perito = perito;
        this.codigo = codigo;
        this.conclusao = conclusao;
        this.local = local;
        this.descricao = descricao;
    }

    public String getPerito() {
        return perito;
    }

    public void setPerito(String perito) {
        this.perito = perito;
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
