package fundamentos_java_28_08;

import java.util.Scanner;

public class CoordenadasPonto {

    public static void main(String[] args) {

        // Declaração das variáveis que armazenarão as coordenadas do ponto
        double x = 0, y = 0;

        // Criação do objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite os valores das coordenadas x e y
        System.out.printf("Digite valor de x e y: ");

        // Leitura das coordenadas fornecidas pelo usuário
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        // Verifica em qual região do plano cartesiano o ponto se encontra
        if (x == 0 && y == 0)
            System.out.println("Origem"); // Ponto está na origem
        else if (y == 0 && x != 0)
            System.out.println("Eixo X"); // Ponto está no eixo X (y = 0)
        else if (x == 0 && y != 0)
            System.out.println("Eixo Y"); // Ponto está no eixo Y (x = 0)
        else if (x > 0 && y > 0)
            System.out.println("Q1"); // Primeiro quadrante
        else if (x < 0 && y > 0)
            System.out.println("Q2"); // Segundo quadrante
        else if (x < 0 && y < 0)
            System.out.println("Q3"); // Terceiro quadrante
        else
            System.out.println("Q4"); // Quarto quadrante

    }
}
