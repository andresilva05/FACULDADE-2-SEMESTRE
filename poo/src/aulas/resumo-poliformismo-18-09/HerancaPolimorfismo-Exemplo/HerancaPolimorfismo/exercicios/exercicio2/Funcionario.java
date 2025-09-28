package exercicios.exercicio2;

public class Funcionario {

    private String nome;
    private int codigoFuncional;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }


    public double calcularRenda() {
        return 1000;
    }

    public void mostrarDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Codigo Funcional: " + codigoFuncional);
        System.out.println("Salário: R$" + calcularRenda());
    }
}
