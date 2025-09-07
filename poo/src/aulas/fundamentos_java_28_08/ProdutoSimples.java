package fundamentos_java_28_08;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {

        // Declaração das variáveis para armazenar os dois números e o produto
        int numero1, numero2, PROD;

        // Criação do objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite dois números inteiros
        System.out.println("Digite o valor de dois numeros:");
        numero1 = scanner.nextInt(); // Lê o primeiro número
        numero2 = scanner.nextInt(); // Lê o segundo número

        // Calcula o produto dos dois números
        PROD = numero1 * numero2;

        // Imprime o resultado do produto
        System.out.println("PROD = " + PROD);
    }
}
