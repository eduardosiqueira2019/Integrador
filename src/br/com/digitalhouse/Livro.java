package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class Livro {

    // código, título, autor, ano de lançamento, código ISBN,
    //quantidade em estoque e preço

    private Integer codigo;
    private String titulo;
    private String anoLancamento;
    private Integer codISBN;
    private Integer qtdeEmEstoque;
    private Float precoLivro;

    public Livro() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getCodISBN() {
        return codISBN;
    }

    public void setCodISBN(Integer codISBN) {
        this.codISBN = codISBN;
    }

    public Integer getQtdeEmEstoque() {
        return qtdeEmEstoque;
    }

    public void setQtdeEmEstoque(Integer qtdeEmEstoque) {
        this.qtdeEmEstoque = qtdeEmEstoque;
    }

    public Float getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(Float precoLivro) {
        this.precoLivro = precoLivro;
    }
}
