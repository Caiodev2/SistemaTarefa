package br.ufpb.dcx.caio;

public class DataSimples {
    private int dia;
    private int mes;
    private int ano;

    public DataSimples(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getMes(){
        return  mes;
    }
    public void setMes(int Mes){
        this.mes = Mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
