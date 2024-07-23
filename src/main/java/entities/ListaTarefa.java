package entities;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa(){
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefaElemento){
        this.listaTarefas.add(tarefaElemento);
    }
    public void removerTarefa(Tarefa tarefaElemento){
        this.listaTarefas.remove(tarefaElemento);
    }

    public List<Tarefa> tarefasPendentes(){
        List<Tarefa> tarefasPendentes = new ArrayList<>();
        for(Tarefa t : this.listaTarefas){
            if(t.isStatus()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    public List<Tarefa> tarefasConcluidas(){
        List<Tarefa> tarefasConcluidas = new ArrayList<>();
        for(Tarefa t : this.listaTarefas){
            if(!t.isStatus()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public List<Tarefa> filtrarTarefasDomesticas(){
        List<Tarefa> listaDomestica = new ArrayList<>();
        for(Tarefa t : this.listaTarefas){
            if(t.getIdentificador().equals("DOMESTICA")){
                listaDomestica.add(t);
            }
        }
        return listaDomestica;
    }
    public List<Tarefa> filtrarTarefasTrabalho(){
        List<Tarefa> listaTrabalho = new ArrayList<>();
        for(Tarefa t : this.listaTarefas){
            if(t.getIdentificador().equals("TRABALHO")){
                listaTrabalho.add(t);
            }
        }
        return listaTrabalho;
    }
    public List<Tarefa> filtrarTarefasFaculdade(){
        List<Tarefa> listaFaculdade = new ArrayList<>();
        for(Tarefa t : this.listaTarefas){
            if(t.getIdentificador().equals("FACULDADE")){
                listaFaculdade.add(t);
            }
        }
        return listaFaculdade;
    }
}
