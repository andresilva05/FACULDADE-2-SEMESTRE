package ClasseObjetoMetodo_java_04_09.exercicio;


//Crie uma classe Livro especificando o título, o autor, a editora e o número de
//páginas. Inclua métodos para retornar o título, a editora e para determinar se o
//livro está emprestado ou não.
//• Dica: Como vou saber se o livro está emprestado? A utilização de um atributo
//resolveria esse problema?


public class cadastroDeLivros {
    public static void main(String[] args) {

        Autor autorLivro = new Autor();
        autorLivro.email = "autor@email.com";
        autorLivro.nome = "João Ramalho";
        autorLivro.cpf = "123456789";


        Livro livro = new Livro();
        livro.nome = "\nIntrodução a POO";
        livro.descricao = "Aprendendo a programação orientada a objetos";
        livro.valor = 59.90;
        livro.isbn = "978-8588062894";
        livro.emprestado = true;

        livro.autor = autorLivro;

        livro.mostrarDetalhes();

        System.out.println("\n=== Detalhes do Livro ===");
        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: R$" + livro.valor);
        System.out.println("ISBN: " + livro.isbn);

        Livro outrolivro = new Livro();
        outrolivro.nome = "POO: Uma abordagem abrangente";
        outrolivro.editora = "Seu zé";
        outrolivro.descricao = "Outro livro que aborda POO";
        livro.totalPaginas = 145;
        outrolivro.valor = 39.90;
        outrolivro.isbn = "123-765283748";
        outrolivro.emprestado = false;

        outrolivro.mostrarDetalhes();


    }
}
