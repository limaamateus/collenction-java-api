package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);  // Adiciona o item à lista
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem;
            }
        } else {
            System.out.println("A lista está vazia!");  // Informa que a lista está vazia
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                System.out.println(item);
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("Lápis", 2d, 3);
        compras.adicionarItem("Caderno", 35d, 1);
        compras.adicionarItem("Borracha", 2d, 3);

        compras.exibirItens();

        compras.removerItem("Lápis");

        compras.exibirItens();

        System.out.println("O valor total da compra é = " + compras.calcularValorTotal());
    }
}
