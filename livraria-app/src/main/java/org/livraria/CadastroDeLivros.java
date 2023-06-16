package org.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro001 = new Livro();
        livro001.setNome("Java 8 Prático");
        livro001.setDescricao("Novos recursos da linguagem");
        livro001.setValor(59.90);
        livro001.setIsbn("978-85-66250-46-6");
        livro001.mostrarDetalhesDoLivro();

        Livro livro002 = new Livro();
        livro001.setNome("Lógica de Programação");
        livro001.setDescricao("Crie seus primeiros programas");
        livro001.setValor(59.90);
        livro001.setIsbn("978-85-66250-22-0");
        livro002.mostrarDetalhesDoLivro();

        Autor autor001 = new Autor();
        autor001.setNome("Rodrigo Turini");
        autor001.setEmail("rodrigo.turini@caelum.com.br");
        autor001.setCpf("123.456.789-10");

        Autor autor002 = new Autor();
        autor002.setNome("Paulo Silveira");
        autor002.setEmail("paulo.silveira@caelum.com.br");
        autor002.setCpf("123.456.789-10");
    }
}
