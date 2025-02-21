package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributo

    private List<Livro> livrosList;

    public CatalagoLivros() {
        this.livrosList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntevalosAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <=anoFinal) {
                    livrosPorIntevalosAnos.add(l);
                }
            }
        }
        return livrosPorIntevalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalogoLivros = new CatalagoLivros();
        catalogoLivros.adicionarLivro("livro 1","autor 1", 2021);
        catalogoLivros.adicionarLivro("livro 1","autor 2", 2021);
        catalogoLivros.adicionarLivro("livro 2","autor 2", 2022);
        catalogoLivros.adicionarLivro("livro 3","autor 3", 2023);
        catalogoLivros.adicionarLivro("livro 4","autor 4", 1994);


        System.out.println(catalogoLivros.pesquisarPorAutor("autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));



    }


}
