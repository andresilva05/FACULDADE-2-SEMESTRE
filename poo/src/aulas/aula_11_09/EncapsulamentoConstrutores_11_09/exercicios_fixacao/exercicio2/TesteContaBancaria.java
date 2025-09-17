package EncapsulamentoConstrutores_11_09.exercicios_fixacao.exercicio2;

// Classe principal para testar a ContaBancaria
public class TesteContaBancaria {

    public static void main(String[] args) {

        // Cria um objeto ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        // Exibe os dados iniciais da conta
        System.out.println("\nNúmero da conta: " + conta.getNumeroConta()); // Número imutável
        System.out.println("Nome titular da conta: " + conta.getNome());    // Nome inicial
        System.out.println("Saldo inicial da conta: " + conta.getSaldoConta()); // Saldo inicial

        // Tenta realizar um depósito
        if (!conta.depositar(50)) { // Se o depósito não for maior que 0
            System.out.println("\nValor de depósito não pode ser negativo ou igual a 0");
        } else {
            // Depósito realizado com sucesso
            System.out.println("\nValor depositado com sucesso!");
            System.out.println("Saldo Atual: " + conta.getSaldoConta()); // Exibe saldo atualizado
        }

        // Tenta realizar um saque
        if (!conta.sacarDinheiro(100)) { // Se o saque for maior que o saldo
            System.out.println("\nValor do saque está maior do que você possui em saldo");
            System.out.println("Saldo Atual: R$" + conta.getSaldoConta()); // Saldo permanece o mesmo
        }

        // Altera o nome do titular
        conta.setNome("João");
        System.out.println("\nNome alterado com sucesso!");

        // Exibe os dados após alterações
        System.out.println("\nNúmero da conta: " + conta.getNumeroConta()); // Número permanece o mesmo
        System.out.println("Nome titular da conta: " + conta.getNome());    // Nome atualizado
        System.out.println("Saldo Atual: " + conta.getSaldoConta());        // Saldo final

    }
}