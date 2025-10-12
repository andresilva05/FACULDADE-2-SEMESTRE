package exercicios;

//2. Faça um programa em JAVA que substitua todas as ocorrências de uma letra
//específica por outra letra.

public class Exercicio2 {

    public static void main(String[] args) {

        // Cria uma string original
        String str = new String("Boa noite");

        // Substitui todas as ocorrências da letra "o" por "I"
        // (replace é sensível a maiúsculas/minúsculas)
        String fraseAlterada = str.replace("o", "I");

        // Exibe o resultado da substituição
        System.out.println(fraseAlterada);
    }
}
