package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class Livraria extends Livro{

    private Map<Integer, String> livrosCadastrados = new HashMap<>();
    private Boolean encontrado = false;

    public Map<Integer, String> getLivrosCadastrados() {
        return livrosCadastrados;
    }

    public void CadastraLivro(Integer codigo, String titulo, String anoLancamento, Integer codISBN, Integer qtdeEmEstoque, Float precoLivro) {
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAnoLancamento(anoLancamento);
        this.setCodISBN(codISBN);
        this.setQtdeEmEstoque(qtdeEmEstoque);
        this.setPrecoLivro(precoLivro);
        livrosCadastrados.put(codigo, titulo);
    }

    public void EfetuarVenda (Integer codigo){
        ConsultaLivro(codigo);
        if(this.getCodigo() != -1){
            if((this.getQtdeEmEstoque() - 1) > 0){
                this.setQtdeEmEstoque(this.getQtdeEmEstoque() - 1);
                System.out.println("Venda Efetuada.");
            } else {
                System.out.println("Estoque Esgotado.");
            }
        }
    }

    public void ConsultaLivro(Integer codigo) {
        encontrado = false;
        for (Integer chave : livrosCadastrados.keySet()) {
            if (codigo.equals(chave)) {
                System.out.println("Livro:  " + this.getTitulo() + "\n" + "Lançamento:   " + this.getAnoLancamento() + "\n" +
                        "ISBN:  "+ this.getCodISBN() + "\n" + "Estoque:  "+ this.getQtdeEmEstoque() + "\n"+
                        "Preço: "+ this.getPrecoLivro());
                encontrado = true;
            }
        }
        if (!encontrado) {
            this.setCodigo(-1);
            System.out.println("Livro não encontrado.");
        }
    }


}
