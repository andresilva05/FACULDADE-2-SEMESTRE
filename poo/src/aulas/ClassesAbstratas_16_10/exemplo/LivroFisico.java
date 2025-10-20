package ClassesAbstratas_16_10.exemplo;

public class LivroFisico extends Livro {
    public LivroFisico(String nome, Autor autor) {
        super(nome, autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    @Override
    boolean aplicaDesconto(double porcentagem) {
        if (porcentagem >= 0.3) {
            return false;
        }
        this.valor = this.valor - (this.valor * porcentagem);
        return false;
    }
}