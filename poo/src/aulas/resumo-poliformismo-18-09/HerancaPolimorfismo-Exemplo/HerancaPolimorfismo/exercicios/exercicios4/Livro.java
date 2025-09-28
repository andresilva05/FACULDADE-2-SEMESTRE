package exercicios.exercicios4;

import java.util.Arrays;

// Classe Livro estende Publicacao, adicionando autores
public class Livro extends Publicacao {

    String autores[];          // Array de autores do livro
    static int contadorLivro = 0; // Contador de livros criados

    // Construtor do livro
    public Livro(String titulo, String assunto, int edicao, Editora editora, String autores[]) {
        super(titulo, assunto, edicao, editora); // Chama o construtor da superclasse Publicacao
        this.autores = autores;                  // Atribui o array de autores

        contadorLivro++;                          // Incrementa contador de livros
    }

    // Método para exibir informações detalhadas do livro
    public void informacoesLivro() {
        System.out.println("\n---------INFORMAÇÕES DO LIVRO---------");
        System.out.println("Título da publicação: " + titulo);
        System.out.println("Assunto: " + assunto);
        System.out.println("Edição: " + edicao);
        System.out.println("Editora: " + editora.getNome());
        System.out.println("Autores: " + Arrays.toString(autores)); // Converte array para string
    }

    // Getter estático para obter total de livros criados
    public static int getContadorLivro() {
        return contadorLivro;
    }
}
