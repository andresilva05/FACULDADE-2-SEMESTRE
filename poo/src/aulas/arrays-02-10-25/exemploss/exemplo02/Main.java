package exemploss.exemplo02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos retângulos? ");
        int n = sc.nextInt();

        Retangulo[] retangulos = new Retangulo[n]; // vetor de objetos

        for (int i = 0; i < n; i++) {
            System.out.println("Retângulo #" + (i + 1) + ":");
            System.out.print("Largura: ");
            double largura = sc.nextDouble();
            System.out.print("Comprimento: ");
            double comprimento = sc.nextDouble();

            retangulos[i] = new Retangulo(largura, comprimento);
        }

        // Calculando a área médiaa
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += retangulos[i].area(); // acessando método do objeto
        }

        double media = soma / n;
        System.out.println("Área média = " + media);

        sc.close();
    }
}
