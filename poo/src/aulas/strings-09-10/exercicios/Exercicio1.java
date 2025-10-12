package exercicios;

import java.util.Scanner;

//Faça um programa em JAVA que leia uma string e exiba o comprimento dela
public class Exercicio1 {
    public static void main(String[] args) {

        // Cria um Scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string:");

        // Lê a string completa (inclusive espaços)
        String str = sc.nextLine();

        // Usa o método length() para obter o tamanho (quantidade de caracteres)
        System.out.println("Comprimento: " + str.length());

        sc.close();
    }
}
