package exercicios.exercicio2;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {

    private String graduacao;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escola, String graduacao) {
        super(nome, codigoFuncional, escola);
        this.graduacao = graduacao;


    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Graduação: " + graduacao);
    }
}
