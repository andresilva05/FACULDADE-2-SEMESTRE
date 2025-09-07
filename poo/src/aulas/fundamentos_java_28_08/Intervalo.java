package fundamentos_java_28_08;

import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class Intervalo {

    public static void main(String[] args) {

        float numeroUsuario; // Variável para armazenar o número digitado pelo usuário
        int sair = 0;        // Variável para controlar o loop (1 = continuar, 0 = sair)

        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para leitura de dados

        // Loop do-while garante que o programa execute pelo menos uma vez
        do {

            System.out.println("Digite um numero: ");
            numeroUsuario = scanner.nextFloat(); // Lê um número flutuante do usuário

            // Verifica se o número está fora do intervalo [0,100]
            if (numeroUsuario < 0 || numeroUsuario > 100)
                System.out.println("Fora de intervalo");

                // Caso o número esteja dentro dos intervalos válidos, verifica em qual faixa ele se encaixa
            else if (numeroUsuario >= 0 && numeroUsuario <= 25)
                System.out.println("Intervalo [0,25]");
            else if (numeroUsuario > 25 && numeroUsuario <= 50)
                System.out.println("Intervalo (25,50]");
            else if (numeroUsuario > 50 && numeroUsuario <= 75)
                System.out.println("Intervalo (50,75]");
            else if (numeroUsuario > 75 && numeroUsuario <= 100)
                System.out.println("Intervalo (75,100]");

            // Pergunta ao usuário se deseja continuar
            System.out.println("\nDeseja continuar?\nSim (1)\nNão (0)");
            sair = scanner.nextInt(); // Lê a resposta do usuário

        } while (sair == 1); // Repete o loop enquanto o usuário digitar 1 (Sim)

        // Mensagem exibida ao encerrar o programa
        System.out.println("Programa se encerrando...");
    }
}
