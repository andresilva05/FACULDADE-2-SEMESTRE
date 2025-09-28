package exercicios.exercicio2;

public class FuncionarioEnsinoBasico extends Funcionario {

    private String escola; // atributo próprio da subclasse

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public double calcularRenda() {
        return super.calcularRenda() * 1.10;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Escola: " + escola);
    }
}
