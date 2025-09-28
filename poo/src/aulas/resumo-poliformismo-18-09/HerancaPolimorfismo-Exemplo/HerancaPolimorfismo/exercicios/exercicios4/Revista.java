package exercicios.exercicios4;

// Classe Revista estende Publicacao, adicionando periodicidade
public class Revista extends Publicacao {

    String periodicidade;       // Periodicidade da revista (semanal, mensal, etc.)
    static int contadorRevistas = 0; // Contador de revistas criadas

    // Construtor da revista
    public Revista(String titulo, String assunto, int edicao, Editora editora, String periodicidade) {
        super(titulo, assunto, edicao, editora); // Chama construtor da superclasse
        this.periodicidade = periodicidade;      // Atribui periodicidade
        contadorRevistas++;                       // Incrementa contador de revistas
    }

    // Método para exibir informações detalhadas da revista
    public void informacoesRevista() {
        System.out.println("\n---------INFORMAÇÕES DA REVISTA---------");
        System.out.println("Título da publicação: " + titulo);
        System.out.println("Assunto: " + assunto);
        System.out.println("Edição: " + edicao);
        System.out.println("Editora: " + editora.getNome());
        System.out.println("Periodicidade: " + periodicidade);
    }

    // Getter estático para total de revistas criadas
    public static int getContadorRevistas() {
        return contadorRevistas;
    }
}
