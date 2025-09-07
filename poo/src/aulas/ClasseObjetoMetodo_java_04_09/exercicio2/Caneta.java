package ClasseObjetoMetodo_java_04_09.exercicio2;
// Define o pacote onde a classe está localizada (organiza o código)

import java.util.Scanner;
// Importa a classe Scanner para ler dados digitados pelo usuário

public class Caneta {
// Declara a classe Caneta, que representa o objeto caneta

    String cor;
    // Atributo que armazena a cor da caneta

    int carga;
    // Atributo que armazena a quantidade de tinta disponível na caneta

    String tampa;
    // Atributo que indica se a caneta está tampada ("sim") ou destampada ("não")

    String tipo;
    // Atributo que indica o tipo da caneta (ex.: esferográfica, tinteiro, marca-texto)

    Scanner scanner = new Scanner(System.in);
    // Cria um Scanner para ler entradas do usuário dentro da classe

    void escreverPalavra() {
        // Método que realiza a ação de escrever uma palavra ou frase

        System.out.println("\nDigite a palavra que deseja escrever ou a frase: ");
        // Mostra uma mensagem pedindo para o usuário digitar uma palavra ou frase

        String palavra = scanner.nextLine();
        // Lê a palavra ou frase digitada pelo usuário e armazena na variável 'palavra'

        int qtdLetras = palavra.length();
        // Calcula a quantidade de letras da palavra usando o método length() e armazena em 'qtdLetras'

        if (carga >= qtdLetras) {
            // Verifica se a caneta possui carga suficiente para escrever a palavra inteira

            if ("sim".equalsIgnoreCase(tampa)) {
                // Verifica se a caneta está tampada (ignora maiúsculas/minúsculas)

                System.out.println("\nCaneta está tampada, não é possível efetuar escrita dessa maneira.");
                // Mostra mensagem caso a caneta esteja tampada

            } else {
                // Caso a caneta não esteja tampada

                System.out.println("\n" + palavra);
                // Mostra a palavra escrita no console

                carga -= qtdLetras;
                // Reduz a carga da caneta de acordo com a quantidade de letras escritas
            }

        } else {
            // Caso a carga seja insuficiente para escrever a palavra inteira

            System.out.println("\nCarga insuficiente para realizar escrita dessa palavra (frase).");
            // Mostra mensagem informando que não é possível escrever
        }
    }
}
