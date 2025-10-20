package ClassesAbstratas_16_10.exercicios.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciaContas {
    Scanner ler = new Scanner(System.in); // Scanner para leitura de dados do usuário

    int qtdContas = 4; // quantidade máxima de contas que podem ser criadas
    ContaBancaria[] contas = new ContaBancaria[qtdContas]; // vetor que armazena as contas
    int totalContas; // controla quantas contas já foram criadas

    // Método auxiliar que busca uma conta pelo número informado
    ContaBancaria buscarConta(int numeroConta) {
        for (int i = 0; i < totalContas; i++) { // percorre todas as contas criadas
            if (contas[i].getNumero() == numeroConta) { // compara o número da conta
                return contas[i]; // retorna a conta encontrada
            }
        }
        return null; // retorna null caso não encontre
    }

    // Método responsável por criar novas contas bancárias
    void criarContas() {
        System.out.println(" ===== CRIAR CONTA =====");
        System.out.println("\n---------------------------------\n");

        // Verifica se já atingiu o limite máximo de contas
        if (totalContas >= qtdContas) {
            System.out.println("Número máximo de contas atingido!");
            return;
        }

        // Enquanto não atingir o limite máximo, permite criar contas
        while (totalContas < qtdContas) {
            System.out.println("Deseja criar conta? (sim/nao)");
            String resposta = ler.nextLine().trim().toLowerCase(); // lê e normaliza a resposta
            if (!resposta.equals("sim")) {
                break; // sai do laço se o usuário não quiser criar
            }

            // Pergunta e valida o tipo de conta
            System.out.println("Qual tipo da conta (corrente/poupança)?");
            String tipoConta = ler.nextLine().trim().toLowerCase();
            while (!tipoConta.equals("corrente") && !tipoConta.equals("poupança")) {
                System.out.println("Tipo de conta inválido, digite novamente:");
                tipoConta = ler.nextLine().trim().toLowerCase();
            }

            // Lê o nome do titular
            System.out.println("Informe seu nome:");
            String titular = ler.nextLine();

            // Lê o saldo inicial com tratamento de erro
            double saldo = 0;
            while (true) {
                try {
                    System.out.println("Qual o saldo inicial?");
                    saldo = ler.nextDouble();
                    ler.nextLine(); // consome o Enter
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido, digite novamente!");
                    ler.nextLine(); // limpa entrada inválida
                }
            }

            // Cria conta conforme o tipo informado
            if (tipoConta.equals("corrente")) {
                double limite = 0;
                while (true) {
                    try {
                        System.out.println("Qual o limite?");
                        limite = ler.nextDouble();
                        ler.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido, digite novamente!");
                        ler.nextLine();
                    }
                }
                // Cria uma conta corrente
                contas[totalContas] = new ContaCorrente(totalContas + 1, titular, saldo, limite);
            } else {
                // Cria uma conta poupança
                contas[totalContas] = new ContaPoupanca(totalContas + 1, titular, saldo);
            }

            System.out.println("Conta criada com sucesso!");
            contas[totalContas].mostrarDetalhes(); // exibe os dados da conta criada
            totalContas++; // incrementa o número total de contas

            System.out.println("\n---------------------------------\n");
        }
    }

    // Método responsável por realizar saques
    void sacar() {
        System.out.println(" ===== REALIZA SAQUE ===== ");
        System.out.println("\n-----------------------------------\n");

        // Verifica se existem contas cadastradas
        if (totalContas == 0) {
            System.out.println("Não há contas cadastradas!");
            return;
        }

        try {
            // Solicita número da conta
            System.out.println("Informe número da conta:");
            int numeroConta = ler.nextInt();
            ler.nextLine();

            // Busca a conta correspondente
            ContaBancaria conta = buscarConta(numeroConta);
            if (conta == null) {
                System.out.println("Conta não encontrada!");
                return;
            }

            // Solicita valor do saque
            System.out.println("Informe o valor do saque:");
            double saque = ler.nextDouble();
            ler.nextLine();

            // Tenta realizar o saque
            boolean sucesso = conta.realizaSaque(saque);

            // Exibe o resultado da operação
            if (sucesso) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente, saque não realizado.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
            ler.nextLine(); // limpa o scanner
        }
    }

    // Método responsável por realizar depósitos
    void depositar() {
        System.out.println(" ===== REALIZA DEPÓSITO ===== ");
        System.out.println("\n-----------------------------------\n");

        // Verifica se existem contas cadastradas
        if (totalContas == 0) {
            System.out.println("Não há contas cadastradas!");
            return;
        }

        try {
            // Solicita número da conta
            System.out.println("Informe número da conta:");
            int numeroConta = ler.nextInt();
            ler.nextLine();

            // Busca a conta correspondente
            ContaBancaria conta = buscarConta(numeroConta);
            if (conta == null) {
                System.out.println("Conta não encontrada!");
                return;
            }

            // Solicita valor do depósito
            System.out.println("Informe valor do depósito:");
            double deposito = ler.nextDouble();
            ler.nextLine();

            // Tenta realizar o depósito
            boolean sucesso = conta.realizaDeposito(deposito);

            // Exibe o resultado da operação
            if (sucesso) {
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("Falha ao realizar depósito!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
            ler.nextLine(); // limpa o scanner
        }
    }

    // Método que exibe todas as contas criadas
    void listarContas() {
        System.out.println(" ===== LISTA DE CONTAS ===== ");
        System.out.println("\n-----------------------------------\n");

        // Se houver contas, mostra cada uma
        if (totalContas != 0) {
            for (int i = 0; i < totalContas; i++) {
                contas[i].mostrarDetalhes();
                System.out.println("\n---------------------------------\n");
            }
        } else {
            System.out.println("Não há contas cadastradas!");
        }
    }

    // Método principal de controle do menu
    void menu() {
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("===== MENU =====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); // consome o Enter

            // Executa a opção escolhida
            switch (opcao) {
                case 1:
                    criarContas();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    listarContas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("\n----------------------------\n");

        } while (opcao != 0); // repete até o usuário escolher sair
    }
}
