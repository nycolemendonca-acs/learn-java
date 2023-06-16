package org.livraria;

public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaDeImpressao() {
        return this.getValor() * 0.05;
    }
}
