package Model;

import java.sql.Timestamp;

public class Relatorio {
    int id;
    Timestamp timestamp;
    String acao;
    String informacao;

    public Relatorio(int id, Timestamp timestamp, String acao, String informacao) {
        this.id = id;
        this.timestamp = timestamp;
        this.acao = acao;
        this.informacao = informacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }    
  
}
