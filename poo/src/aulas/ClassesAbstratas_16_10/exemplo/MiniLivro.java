package ClassesAbstratas_16_10.exemplo;

public class MiniLivro extends Livro {
    public MiniLivro(String nome, Autor autor) {
        super(nome, autor);
    }

    @Override
    boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}