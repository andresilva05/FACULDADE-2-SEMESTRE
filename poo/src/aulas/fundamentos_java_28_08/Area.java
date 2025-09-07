package fundamentos_java_28_08;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        // Declaração das variáveis que irão armazenar os três valores de entrada
        float A, B, C;

        // Declaração das variáveis que irão armazenar as áreas das figuras geométricas
        float area_triangulo, area_trapezio, area_quadrado, area_retangulo;

        // Criação do objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite três valores
        System.out.println("Digite três valores: ");

        // Leitura dos três valores digitados pelo usuário
        A = scanner.nextFloat();
        B = scanner.nextFloat();
        C = scanner.nextFloat();

        // Cálculo da área do triângulo (base * altura / 2)
        area_triangulo = (A * C) / 2;

        // Cálculo da área do círculo (pi * raio^2)
        double area_circulo = 3.14159 * C * C;

        // Cálculo da área do trapézio ((base1 + base2) * altura / 2)
        area_trapezio = ((A + B) * C) / 2;

        // Cálculo da área do quadrado (lado^2)
        area_quadrado = B * B;

        // Cálculo da área do retângulo (base * altura)
        area_retangulo = A * B;

        // Impressão das áreas calculadas com 3 casas decimais
        System.out.printf("\nTRIANGULO: %.3f", area_triangulo);
        System.out.printf("\nCIRCULO: %.3f", area_circulo);
        System.out.printf("\nTRAPEZIO: %.3f", area_trapezio);
        System.out.printf("\nQUADRADO: %.3f", area_quadrado);
        System.out.printf("\nRETANGULO: %.3f", area_retangulo);
    }
}
