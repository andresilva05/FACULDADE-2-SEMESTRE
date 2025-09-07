package fundamentos_java_28_08;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {

        // Declaração das variáveis para armazenar as notas e a média ponderada
        double notaA, notaB, mediaPonderada;

        // Criação do objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a primeira nota
        System.out.println("Digite o valor da nota 1: ");
        notaA = scanner.nextDouble(); // Lê a primeira nota

        // Solicita ao usuário que digite a segunda nota
        System.out.println("Digite o valor da nota 2: ");
        notaB = scanner.nextDouble(); // Lê a segunda nota

        // Cálculo da média ponderada com pesos 3.5 e 7.5
        mediaPonderada = (notaA * 3.5 + notaB * 7.5) / 11;

        // Impressão da média ponderada com 5 casas decimais
        System.out.printf("MEDIA = %.5f\n", mediaPonderada);
    }
}
