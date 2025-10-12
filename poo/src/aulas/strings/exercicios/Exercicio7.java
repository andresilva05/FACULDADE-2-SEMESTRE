package exercicios;

import java.util.Scanner;

//7. Concatenar duas strings
//Escreva um programa Java para concatenar uma determinada string ao final de outra
//string.
//Saída de exemplo:
//String 1: Exercícios de PHP e
//String 2: Exercícios em Python
//A string concatenada: Exercícios de PHP e Exercícios de Python
public class Exercicio7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Solicita a primeira frase ao usuário
        System.out.println("Digite a primeira frase: ");
        String frase1 = ler.nextLine();

        // Solicita a segunda frase ao usuário
        System.out.println("Digite a segunda frase: ");
        String frase2 = ler.nextLine();

        // Concatena as duas frases, adicionando um espaço entre elas
        String fraseConcatenada = frase1.concat(" ").concat(frase2);

        // Exibe o resultado final
        System.out.println("String concatenada: " + fraseConcatenada);

        ler.close();
    }
}
