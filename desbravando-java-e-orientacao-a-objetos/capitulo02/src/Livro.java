public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        String mensagem = "Detalhes do Livro";

        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();
        System.out.println("-----------");
    }
}