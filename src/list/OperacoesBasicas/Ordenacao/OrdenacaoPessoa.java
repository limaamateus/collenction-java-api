package list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa(List<Pessoa> pessoasList) {
        this.pessoasList = new ArrayList<>();
    }
    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adiconarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adiconarPessoa("nome 1", 20,1.56);
        ordenacaoPessoa.adiconarPessoa("nome 2", 30,1.80);
        ordenacaoPessoa.adiconarPessoa("nome 3", 25,1.70);
        ordenacaoPessoa.adiconarPessoa("nome 4", 17,1.56);

        System.out.println(ordenacaoPessoa.pessoasList);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }
}
