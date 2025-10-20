package ClassesAbstratas_16_10.exemplo;

public abstract class Livro {
    private String nome;
    private String descricao;
    protected double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livro() {
        this.isbn = "000-0000-000";
    }

    public Livro(String nome, Autor a) {
        this.nome = nome;
        this.autor = a;
    }


    public Livro(String nome, String descricao, double valor, String isbn, Autor a) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = a;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    boolean possuiAutor() {
        return (autor != null);


    }

    void mostrarDetalhes() {
        System.out.println("\n -- Exibindo livro --");
        System.out.println("Nome: " + nome + "\nDescrição: " + descricao + "\nValor: " + valor + "\nIsbn: " + isbn);
        if (possuiAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    abstract boolean aplicaDesconto(double porcentagem);


}

