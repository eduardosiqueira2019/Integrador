package br.com.digitalhouse;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Livraria livro = new Livraria();
        Integer opcao=1;
        Integer codigo; String titulo; String anoLancamento; Integer codISBN; Integer qtdeEmEstoque; Float precoLivro;

        livro.CadastraLivro (1,"Programando em Java","2019",2343,0,55.00f);
        livro.CadastraLivro (2,"Programando em .NET ","2019",2121,0,51.0f);
        livro.CadastraLivro (3,"Programando em Java","2019",2343,0,55.0f);

        while (opcao < 5) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sistema de Estoque de Livros\n\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Consultar Livro");
            System.out.println("3 - Efetuar Venda");
            System.out.println("4 - Sair");

            try {
                opcao = scan.nextInt();
                if (opcao == 1) {
                    Scanner scan1 = new Scanner(System.in);

                    System.out.println("Titulo: ");
                    titulo = scan1.next();

                    System.out.println("Ano do Lançamento: ");
                    anoLancamento = scan1.next();

                    System.out.println("ISBN: ");
                    codISBN = scan1.nextInt();

                    System.out.println("Estoque: ");
                    qtdeEmEstoque = scan1.nextInt();

                    System.out.println("Preço: ");
                    precoLivro = scan1.nextFloat();

                    livro.CadastraLivro(livro.getLivrosCadastrados().size() + 1, titulo,
                            anoLancamento, codISBN, qtdeEmEstoque, precoLivro);

                } else if (opcao == 2) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Código do Livro: ");
                    codigo = scan2.nextInt();
                    livro.ConsultaLivro(codigo);
                } else if (opcao == 3) {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("Código do Livro: ");
                    codigo = scan3.nextInt();
                    livro.EfetuarVenda(codigo);
                } else if (opcao == 4) {
                    System.exit(0);
                }
            } catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("Operação inválida.\n Tente novamente.");
            }
        }
    }
}
