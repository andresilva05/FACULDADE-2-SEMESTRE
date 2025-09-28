package Exemplo;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Luiz Henrique");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Introdução a POO");
        fisico.setValor(49.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("POO com Java");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total do carrinho: " + carrinho.getTotal());

        // Testando descontos
        if (!fisico.aplicaDesconto(0.3)) {
            System.out.println("Desconto do livro físico deve ser menor que 30%");
        } else {
            System.out.println("Exemplo.Livro físico com desconto: " + fisico.getValor());
        }

        if (!ebook.aplicaDesconto(0.3)) {
            System.out.println("Desconto do e-book deve ser menor que 15%");
        } else {
            System.out.println("E-book com desconto: " + ebook.getValor());
        }
    }
}
