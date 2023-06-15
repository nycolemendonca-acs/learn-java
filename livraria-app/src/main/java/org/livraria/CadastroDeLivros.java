package org.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro001 = new Livro();
        livro001.nome = "Java 8 Prático";
        livro001.descricao = "Novos recursos da linguagem";
        livro001.valor = 59.90;
        livro001.isbn = "978-85-66250-46-6";
        livro001.mostrarDetalhes();

        Livro livro002 = new Livro();
        livro002.nome = "Lógica de Programação";
        livro002.descricao = "Crie seus primeiros programas";
        livro002.valor = 59.90;
        livro002.isbn = "978-85-66250-22-0";
        livro002.mostrarDetalhes();

        Autor autor001 = new Autor();
        autor001.nome = "Rodrigo Turini";
        autor001.email = "rodrigo.turini@caelum.com.br";
        autor001.cpf = "123.456.789-10";

        Autor autor002 = new Autor();
        autor002.nome = "Paulo Silveira";
        autor002.email = "paulo.silveira@caelum.com.br";
        autor002.cpf = "123.456.789-10";
    }
}
