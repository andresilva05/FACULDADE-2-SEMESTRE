package exercicios;

import java.util.Scanner;

//8. Contém sequência especificada
//Escreva um programa Java para testar se uma determinada string contém a sequência
//especificada de valores char.
//Saída de exemplo:
//String original: PHP Exercises and Python Exercises
//Sequência especificada de valores char: and
//verdadeiro
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Lê a frase completa
        System.out.println("Digite uma frase: ");
        String str = ler.nextLine();

        // Lê a palavra que será procurada dentro da frase
        System.out.println("Digite a palavra a ser procurada: ");
        String palavraProcurada = ler.next();

        // Verifica se a frase contém a palavra (ignorando maiúsculas/minúsculas)
        boolean contemPalavraProcurada = str.toLowerCase().contains(palavraProcurada);

        // Exibe o resultado (true ou false)
        System.out.println(contemPalavraProcurada);

        ler.close();
    }
}
