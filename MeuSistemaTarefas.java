package br.ufpb.dcx.caio;


import java.util.ArrayList;
import java.util.List;

public class MeuSistemaTarefas implements SistemaTarefas {
    private List<Tarefa> tarefas;
    public MeuSistemaTarefas(){
        this.tarefas = new ArrayList<>();
    }


    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }


    public List<Tarefa> pesquisarTarefasParaOMes(int mes, int ano) {
        List<Tarefa> DatasLimite = new ArrayList<>();
        for (Tarefa f: this.tarefas) {
            if (f.getDataLimite().getMes() == mes ){
                DatasLimite.add(f);
            }
        }
        return DatasLimite;
    }


    @Override
    public void atualizarStatusDeTarefa(String descricao, String novoStatusTarefa) {
        for (Tarefa f:this.tarefas){
            if (f.getDescricao().equals(descricao)){
                f.setStatus(novoStatusTarefa);
            }
        }
    }
    public List<Tarefa> pesquisarTarefasPorStatus(String statusTarefa){
        ArrayList<Tarefa> Tarefporsts = new ArrayList<>();
        for (Tarefa f : this.tarefas){
            if (f.getStatus().equals(statusTarefa)){
                Tarefporsts.add(f);
            }
        }
        return Tarefporsts;
    }


    public void cadastrarTarefa(String descricao, String categoria, DataSimples prazoEstimado, String Status) {
        Tarefa NewTarefa = new Tarefa(descricao,categoria,prazoEstimado,Status);
        this.tarefas.add(NewTarefa);
    }

    public ArrayList<Tarefa> pesquisarTarefaPorDescricao(String descricao) {
        ArrayList<Tarefa> TafpDescricao = new ArrayList<>();
        for (Tarefa f:this.tarefas){
            if (f.getDescricao().equals(descricao)){
                TafpDescricao.add(f);
            }
        }
        return TafpDescricao;
    }
}

