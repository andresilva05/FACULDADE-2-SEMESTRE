package ClasseObjetoMetodo_java_04_09.exercicio;


public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private Boolean emprestado = false;
    private String editora;
    private int totalPaginas;

    public Livro() {
        System.out.println("Livro criado com sucesso.");
    }

    public Livro(Autor autor) {
        this.autor = autor;
    }

    boolean possuiAutor() {
        if (autor != null) {
            return true;
        }
        return false;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Boolean getEmprestado() {
        return this.emprestado;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    boolean aplicaDesconto(double valor) {
        if (valor <= 0.5) {
            this.valor -= this.valor * valor;
            return true;
        }
        return false;
    }

    void mostrarDetalhes() {

        System.out.println(this.nome);
        System.out.println(this.editora);
        System.out.println(this.descricao);
        System.out.println((this.totalPaginas + " páginas"));
        System.out.println(this.valor + " reais");
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
