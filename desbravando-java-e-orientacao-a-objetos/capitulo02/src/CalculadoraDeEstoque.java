public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;    // Acumula o valor total dos livros

        // Adição de 35 livros de 59.90
        for (int i = 0; i <= 35; i++) {
            soma += 59.90;

        }

        System.out.println("O total em estoque é " + soma);

        if (soma < 150) System.out.println("O estoque está baixo.");
        else if (soma >= 2000) System.out.println("O estoque está alto.");
        else System.out.println("O estoque está ok.");
    }
}
