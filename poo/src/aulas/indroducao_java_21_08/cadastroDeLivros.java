package indroducao_java_21_08;

class CadastroDeLivros {


    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Introdução a POO";
        livro.descricao = "Aprendendo a programação orientada a objetos";
        livro.valor = 59.90;
        livro.isbn = "978-8588062894";
        livro.mostrarDetalhes();


        System.out.println("=== Detalhes do Livro ===");
        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: R$" + livro.valor);
        System.out.println("ISBN: " + livro.isbn);


        Livro outroLivro = new Livro();
        outroLivro.nome = "\nPOO: Uma abordagem abrangente";
        outroLivro.descricao = "Outro livro que aborda POO";
        outroLivro.valor = 39.90;
        outroLivro.isbn = "123-765283748";

        outroLivro.mostrarDetalhes();
    }
}
