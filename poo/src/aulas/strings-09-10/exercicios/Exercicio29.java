package exercicios;

//Escreva um programa Java para converter todos os caracteres de uma string para
//minúsculas.
//Saída de exemplo:
//String original: The Quick Brown Fox!
//String em minúsculas: the quick brown fox!

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entrada do teclado
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");

        // Lê a linha digitada e já converte todos os caracteres para minúsculo
        String str = ler.nextLine().toLowerCase();

        // Exibe a string convertida
        System.out.println("String em minúsculas: " + str);

        ler.close();
    }
}
