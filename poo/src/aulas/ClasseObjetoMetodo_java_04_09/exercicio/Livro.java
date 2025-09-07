package ClasseObjetoMetodo_java_04_09.exercicio;


public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;
    Boolean emprestado = false;
    String editora;
    int totalPaginas;

    boolean possuiAutor() {
        if (autor != null) {
            return true;
        }
        return false;
    }

    void mostrarDetalhes() {

        System.out.println(this.nome);
        System.out.println(this.editora);
        System.out.println(this.descricao);
        System.out.println((this.totalPaginas + " páginas"));
        System.out.println(this.valor + "reais");
        System.out.println(this.isbn);
        if (emprestado == true) {
            System.out.println("Livro emprestado");
        } else {
            System.out.println("Livro disponível");
        }
        System.out.println("\n === Informações do autor === ");
        if (possuiAutor()) {
            autor.mostrarAutor();
        } else {
            System.out.println("Sem informação do autor");
        }

        System.out.println("=================================");

    }

}
