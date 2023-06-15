package org.livraria;

public class Livro {
    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()) autor.mostrarDetalhes();
        System.out.println("---------------");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        // Descontos maiores que 30% não são válidos
        if (porcentagem > 0.3) return false;

        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    void adicionaValor() { this.valor =  valor; }

    double retornaValor() { return this.valor; }
}
