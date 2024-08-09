package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescrcaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("o numero total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
       listaTarefa.adicionarTarefa("Tarefa2");
       System.out.println("o numero total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefa());

      listaTarefa.removerTarefa("Tarefa1");
      System.out.println("o numero total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefa());

      listaTarefa.obterDescrcaoTarefa();
    }
}
