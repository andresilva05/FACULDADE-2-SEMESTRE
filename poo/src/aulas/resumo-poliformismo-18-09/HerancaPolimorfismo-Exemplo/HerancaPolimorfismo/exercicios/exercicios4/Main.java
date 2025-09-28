package exercicios.exercicios4;

public class Main {

    public static void main(String[] args) {

        // Criação de autores para livro 1
        String[] autoresLivro1 = {"Eric Freeman", "Elisabeth Freeman"};
        // Criação da editora do livro 1
        Editora oreilly = new Editora("O'Reilly", "http://oreilly.com/");
        // Criação do objeto livro1
        Livro livro1 = new Livro("Padrões de Projeto", "Programação", 2, oreilly, autoresLivro1);

        // Criação de autores para livro 2
        String[] autoresLivro2 = {"Robert C. Martin"};
        // Criação da editora do livro 2
        Editora altaBooks = new Editora("Alta Books", "http://altaBooks.com/");
        // Criação do objeto livro2
        Livro livro2 = new Livro("Clean Code", "Desenvolvimento de Software", 1, altaBooks, autoresLivro2);

        // Criação do objeto revista 1
        Editora editoraTres = new Editora("Editora Três", "http://editoraTres.com/");
        Revista revista1 = new Revista("Isto É", "Notícias", 2279, editoraTres, "Semanal");

        // Criação do objeto revista 2
        Editora abril = new Editora("Abril", "http://abril.com/");
        Revista revista2 = new Revista("Superinteressante", "Ciência e Tecnologia", 315, abril, "Mensal");

        // Exibe informações dos livros
        livro1.informacoesLivro();
        livro2.informacoesLivro();

        // Exibe informações das revistas
        revista1.informacoesRevista();
        revista2.informacoesRevista();

        // Exibe totais de editoras, livros e revistas
        System.out.println("\nTotal de Editoras até o momento: " + Editora.getContadorEditora());
        System.out.println("\nTotal de Livros até o momento: " + Livro.getContadorLivro());
        System.out.println("\nTotal de Revistas até o momento: " + Revista.getContadorRevistas());
    }
}
