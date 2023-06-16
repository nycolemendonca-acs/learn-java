package org.livraria;

public class CarrinhoDeCompras {
    private double total;
    public void adiciona(Livro livro) {
        Ebook ebook = (Ebook) livro;
        ebook.getWaterMark();
        System.out.println("Adicionando: " + livro);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
