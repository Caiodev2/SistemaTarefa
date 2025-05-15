package br.ufpb.dcx.caio;

public class Tarefa {
    private String descricao;
    private String categoria;
    private DataSimples dataLimite;
    private String status;


    public Tarefa(String descricao, String categoria, DataSimples dataLimite, String status) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.dataLimite = dataLimite;
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public DataSimples getDataLimite() {
        return dataLimite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Tarefa: " + descricao + " da cartegoria " + categoria + " Seu Status: " + status;
    }
}
