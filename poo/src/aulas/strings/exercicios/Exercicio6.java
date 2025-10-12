package exercicios;

public class Exercicio6 {
//5. Comparação de sequências lexicográficas
//Escreva um programa Java para comparar duas strings lexicograficamente.
//Duas strings são lexicograficamente iguais se tiverem o mesmo comprimento e
//contiverem os mesmos caracteres nas mesmas posições.
//Saída de exemplo:
//String 1: Este é o Exercício 1
//String 2: Este é o Exercício 2
//"Este é o Exercício 1" é menor que "Este é o Exercício 2"

    public static void main(String[] args) {

        // Criação de duas strings para comparação
        String str = new String("Este é o Exercício 1");
        String str2 = new String("Este é o Exercício 1");

        // compareTo() retorna:
        // 0 → se as strings forem iguais
        // >0 → se a primeira for "maior"
        // <0 → se a primeira for "menor"
        int lexicograficamente = str.compareTo(str2);

        // Verifica o resultado da comparação
        if (lexicograficamente == 0) {
            System.out.println("As Strings são lexicograficamente iguais");
        } else if (lexicograficamente > 0) {
            System.out.println(str + " é maior que " + str2);
        } else {
            System.out.println(str2 + " é maior que " + str);
        }
    }
}
