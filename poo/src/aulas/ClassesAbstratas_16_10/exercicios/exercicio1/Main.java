package ClassesAbstratas_16_10.exercicios.exercicio1;

// Classe principal para executar o programa
public class Main {

    public static void main(String[] args) {

        // Criação de uma conta corrente e uma conta poupança
        ContaCorrente cc1 = new ContaCorrente(1, "André", 2000, 3000);
        ContaPoupanca cc2 = new ContaPoupanca(2, "Wilson", 3000);

        // Mostra as informações iniciais das contas
        cc1.mostrarDetalhes();
        cc2.mostrarDetalhes();
        System.out.println("\n-----------------------------\n");

        System.out.println("==== INFORMAÇÕES DE SAQUE ==== ");

        // Tentativa de saque na conta corrente
        if (cc1.realizaSaque(2500)) {
            System.out.println("CONTA: " + cc1.getTitular() + "\nSaque realizado com sucesso!\nSaldo atual: R$" + cc1.getSaldo());
            System.out.println("\n-----------------------------\n");
        } else {
            System.out.println("CONTA: " + cc1.getTitular() + "\nSaque não realizado, saldo insuficiente.");
            System.out.println("\n-----------------------------\n");
        }

        // Tentativa de saque na conta poupança
        if (cc2.realizaSaque(3000)) {
            System.out.println("CONTA: " + cc2.getTitular() + "\nSaque realizado com sucesso!\nSaldo atual: R$" + cc2.getSaldo());
            System.out.println("\n-----------------------------\n");
        } else {
            System.out.println("CONTA: " + cc2.getTitular() + "Saque não realizado, saldo insuficiente.");
        }

        // Mostra novamente os detalhes atualizados das contas
        cc1.mostrarDetalhes();
        cc2.mostrarDetalhes();
    }
}
