package exercicios;
//19. Obtenha o índice de caracteres do alfabeto
//Escreva um programa Java para obter o índice de todos os caracteres do alfabeto.
//Saída de exemplo:
//abcdefghij
//=========================
//        36 10 7 40 2 16 42 1 6 20
//klmnopqrst
//===========================
//        8 35 22 14 12 23 4 11 24 31
//uvwxyz
//================
//        5 27 13 18 38 37
//Exemplo de sequência de caracteres de todo o alfabeto: "The quick brown fox jumps
//over the lazy dog. "

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Solicita ao usuário que digite as letras do alfabeto (ou qualquer palavra)
        System.out.println("Digite todos os caracteres do alfabeto: ");
        String alfabeto = ler.nextLine();

        //Retira todos espaços em brancos da string e converte a entrada para minúsculas para evitar erros com letras maiúsculas
        alfabeto = alfabeto.replace(" ", "").toLowerCase();

        // Percorre cada caractere da string digitada
        for (int i = 0; i < alfabeto.length(); i++) {

            // Pega o caractere da posição atual
            char letra = alfabeto.charAt(i);

            // Converte o caractere em seu código numérico (Unicode)
            int codigo = (int) letra;

            // Subtrai 96 para obter o índice da letra no alfabeto:
            int indice = codigo - 96;

            // Exibe a letra e seu índice correspondente
            System.out.println(letra + " -> índice: " + indice);
        }

        ler.close();
    }
}

