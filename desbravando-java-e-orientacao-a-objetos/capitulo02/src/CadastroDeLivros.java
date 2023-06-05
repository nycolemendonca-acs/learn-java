public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor001 = new Autor();
        autor001.nome = "Rodrigo Turini";
        autor001.email = "rodrigo.turini@caelum.com.br";
        autor001.cpf = "123.456.789-10";

        Autor autor002 = new Autor();
        autor002.nome = "Paulo Silveira";
        autor002.email = "paulo.silveira@cauelum.com.br";
        autor002.cpf = "13.456.789-10";

        Livro livro001 = new Livro();
        livro001.nome = "Java 8 Prático";
        livro001.autor = autor001;
        livro001.descricao = "Novos recursos na linguagem";
        livro001.valor = 59.90;
        livro001.isbn = "978-85-66250-46-6";
        livro001.mostrarDetalhes();

        Livro livro002 = new Livro();
        livro002.nome = "Lógica de Programação";
        livro002.autor = autor002;
        livro002.descricao = "Crie seus primeiros programas";
        livro002.valor = 59.90;
        livro002.isbn = "978-85-6650-22-0";
        livro002.mostrarDetalhes();

        Livro livro003 = new Livro();
        livro003.valor = 59.90;
        System.out.println("Valor atual: " + livro003.valor);
        livro003.valor -= livro003.valor * 0.1;
        System.out.println("Valor com desconto: " + livro003.valor);

    }
}
