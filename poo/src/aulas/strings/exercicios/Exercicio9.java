package exercicios;

import java.util.Scanner;

//9. Compare com a sequência de caracteres
//Escreva um programa Java para comparar uma determinada string com a sequência de
//caracteres especificada.
//Saída de exemplo:
//Comparando example.com e example.com: verdadeiro
//Comparando Example.com e example.com: falso

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Solicita a primeira string
        System.out.println("Digite a primeira frase: ");
        String str1 = ler.nextLine();

        // Solicita a segunda string
        System.out.println("Digite a segunda frase: ");
        String srt2 = ler.nextLine();

        // Compara as strings exatamente (diferencia maiúsculas e minúsculas)
        if (str1.equals(srt2)) {
            System.out.println("Comparando " + str1 + " e " + srt2 + ": verdadeiro");
        } else {
            System.out.println("Comparando " + str1 + " e " + srt2 + ": falso");
        }

        ler.close();
    }
}
