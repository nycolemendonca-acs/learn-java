package org.livraria;

public class Ebook extends Livro {
    private String waterMark;
    public String getWaterMark() {
        return waterMark;
    }

    @Override // método Reescrito
    public boolean aplicaDescontoDe(double porcentagem) {
        // Porcentagem máxima de desconto = 15%
        if (porcentagem > 0.15) return false;
        System.out.println("aplicando desconto no Ebook");
        return super.aplicaDescontoDe(porcentagem);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public Ebook(Autor autor) {
        super(autor);
    }
}
