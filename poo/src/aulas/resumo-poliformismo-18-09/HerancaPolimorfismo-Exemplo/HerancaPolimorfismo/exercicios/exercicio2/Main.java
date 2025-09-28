package exercicios.exercicio2;

public class Main {

    public static void main(String[] args) {


        FuncionarioEnsinoBasico funcionario1 = new FuncionarioEnsinoBasico("João", 1, "Ensino Básico");
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Vitor", 2, "Ensino Básico");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Gracielli", 3, "Ensino Médio");
        FuncionarioGraduacao funcionario4 = new FuncionarioGraduacao("André", 4, "Ensino Médio", "Instituto Federal");
        FuncionarioEnsinoBasico funcionario5 = new FuncionarioEnsinoBasico("Vitor2", 5, "Ensino Básico");
        FuncionarioEnsinoBasico funcionario6 = new FuncionarioEnsinoBasico("Vitor4", 7, "Ensino Básico");
        FuncionarioEnsinoMedio funcionario7 = new FuncionarioEnsinoMedio("Gracielli", 8, "Ensino Médio");
        FuncionarioEnsinoMedio funcionario8 = new FuncionarioEnsinoMedio("Gracielli", 9, "Ensino Médio");
        FuncionarioEnsinoMedio funcionario9 = new FuncionarioEnsinoMedio("Gracielli", 10, "Ensino Médio");
        FuncionarioGraduacao funcionario10 = new FuncionarioGraduacao("Murilo", 4, "Ensino Médio", "UNESP");

        funcionario1.mostrarDados();
        funcionario2.mostrarDados();
        funcionario3.mostrarDados();
        funcionario4.mostrarDados();
        funcionario5.mostrarDados();
        funcionario6.mostrarDados();
        funcionario7.mostrarDados();
        funcionario8.mostrarDados();
        funcionario9.mostrarDados();
        funcionario10.mostrarDados();

        double totalBasico = funcionario1.calcularRenda() + funcionario2.calcularRenda() + funcionario5.calcularRenda() + funcionario6.calcularRenda();


        double totalMedio = funcionario3.calcularRenda() + funcionario7.calcularRenda() + funcionario8.calcularRenda() + funcionario9.calcularRenda();


        double totalGraduacao = funcionario4.calcularRenda() + funcionario10.calcularRenda();


        double totalEmpresa = totalBasico + totalMedio + totalGraduacao;


        System.out.printf("\nTotal de gastos com funcionários do ensino básico: R$ %.2f\n", totalBasico);
        System.out.printf("Total de gastos com funcionários do ensino médio: R$ %.2f\n", totalMedio);
        System.out.printf("Total de gastos com funcionários do ensino superior: R$ %.2f\n", totalGraduacao);
        System.out.printf("Total de gastos da empresa: R$ %.2f\n", totalEmpresa);

    }
}
