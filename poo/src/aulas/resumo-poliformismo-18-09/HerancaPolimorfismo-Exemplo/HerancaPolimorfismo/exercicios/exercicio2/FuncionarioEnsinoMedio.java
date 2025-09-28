package exercicios.exercicio2;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.5;
    }

    public void mostrarDados() {
        super.mostrarDados();
    }
}
