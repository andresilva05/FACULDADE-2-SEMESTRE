package exemploss.exemplo01;

import java.util.Scanner;

public class VetorPesos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt();

        double[] pesos = new double[n]; // vetor de double
        double soma = 0.0;
        // Leitura dos pesos
        for (int i = 0; i < n; i++) {
            System.out.print("Peso da pessoa " + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();
            soma += pesos[i];

        }

        // Cálculo da médiaa
        double media = soma / n;

        System.out.println("Peso médio = " + media);

        sc.close();
    }
}
