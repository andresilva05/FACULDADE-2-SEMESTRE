// Crie uma classe que represente uma Calculadora simples.
// Essa classe terá os métodos de adição, subtração, divisão e multiplicação.
// Os métodos devem receber dois parâmetros (Ex: valor1 e valor2) e retornar o resultado.

package ClasseObjetoMetodo_java_04_09.exercicio3; // Pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class Calculadora { // Declaração da classe Calculadora

    public static void main(String[] args) { // Método principal que inicia o programa

        Calculadora calculadora = new Calculadora(); // Cria um objeto da classe Calculadora para usar os métodos não static

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado

        System.out.println("\nInforme o valor do primeiro número: "); // Pede o primeiro número ao usuário
        int numero1 = scanner.nextInt(); // Lê o primeiro número e armazena em numero1

        System.out.println("\nInforme o valor do segundo número: "); // Pede o segundo número ao usuário
        int numero2 = scanner.nextInt(); // Lê o segundo número e armazena em numero2

        // Exibe o resultado da adição usando o método adicao()
        System.out.println("Resultado de " + numero1 + " + " + numero2 + " é = " + calculadora.adicao(numero1, numero2));

        // Exibe o resultado da subtração usando o método subtracao()
        System.out.println("Resultado de " + numero1 + " - " + numero2 + " é = " + calculadora.subtracao(numero1, numero2));

        // Exibe o resultado da divisão usando o método divisao()
        System.out.println("Resultado de " + numero1 + " / " + numero2 + " é = " + calculadora.divisao(numero1, numero2));

        // Exibe o resultado da multiplicação usando o método multiplicacao()
        System.out.println("Resultado de " + numero1 + " * " + numero2 + " é = " + calculadora.multiplicacao(numero1, numero2));

    }

    // Método para somar dois valores inteiros e retornar a soma
    int adicao(int valor1, int valor2) {
        return valor1 + valor2;
    }

    // Método para subtrair dois valores inteiros e retornar a diferença
    int subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }

    // Método para dividir dois valores inteiros e retornar o resultado como float
    float divisao(int valor1, int valor2) {
        return (float) valor1 / valor2; // Conversão para float para evitar truncamento
    }

    // Método para multiplicar dois valores inteiros e retornar o produto
    int multiplicacao(int valor1, int valor2) {
        return valor1 * valor2;
    }
}
