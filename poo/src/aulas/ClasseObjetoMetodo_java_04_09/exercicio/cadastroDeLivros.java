package ClasseObjetoMetodo_java_04_09.exercicio;


//Crie uma classe Livro especificando o título, o autor, a editora e o número de
//páginas. Inclua métodos para retornar o título, a editora e para determinar se o
//livro está emprestado ou não.
//• Dica: Como vou saber se o livro está emprestado? A utilização de um atributo
//resolveria esse problema?


public class cadastroDeLivros {
    public static void main(String[] args) {

        Autor autorLivro = new Autor();
        autorLivro.setEmail("autor@email.com");
        autorLivro.setNome("João Ramalho");
        autorLivro.setCpf("123456789");


        Livro livro = new Livro();
        livro.setNome("\nIntrodução a POO");
        livro.setDescricao("Aprendendo a programação orientada a objetos");
        livro.setValor(59.90);
        livro.setIsbn("978-8588062894");
        livro.setEmprestado(true);
        livro.setAutor(autorLivro);
        livro.mostrarDetalhes();
        if (!livro.aplicaDesconto(0.5)) {
            System.out.println("O valor máximo do desconto é de 50%");
        }
        System.out.println("O valor após o desconto: R$" + livro.getValor());
        livro.mostrarDetalhes();


        Livro livro2 = new Livro(autorLivro);
       // System.out.println(livro2.getAutor().getNome());
        livro2.mostrarDetalhes();
    }
}
