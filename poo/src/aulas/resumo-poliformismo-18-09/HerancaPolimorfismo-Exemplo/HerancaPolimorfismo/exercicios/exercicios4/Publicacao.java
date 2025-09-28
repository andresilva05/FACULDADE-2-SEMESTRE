package exercicios.exercicios4;

// Classe Publicacao representa qualquer publicação genérica
public class Publicacao {

    String titulo;    // Título da publicação
    String assunto;   // Assunto ou tema
    int edicao;       // Número da edição
    Editora editora;  // Editora associada à publicação

    // Construtor da publicação
    public Publicacao(String titulo, String assunto, int edicao, Editora editora) {
        this.titulo = titulo;       // Atribui título
        this.assunto = assunto;     // Atribui assunto
        this.edicao = edicao;       // Atribui edição
        this.editora = editora;     // Atribui editora

    }

    // Getter para a editora
    public Editora getEditora() {
        return editora;
    }

    // Getter para o título
    public String getTitulo() {
        return titulo;
    }

    // Getter para o assunto
    public String getAssunto() {
        return assunto;
    }

    // Getter para a edição
    public int getEdicao() {
        return edicao;
    }

    // Método para exibir informações da publicação
    public void informacoesPublicacao() {
        System.out.println("\n---------INFORMAÇÕES DA PUBLICAÇÃO---------");
        System.out.println("Título da publicação: " + titulo);
        System.out.println("Assunto: " + assunto);
        System.out.println("Edição: " + edicao);
        System.out.println("Editora: " + editora.getNome());
    }
}
