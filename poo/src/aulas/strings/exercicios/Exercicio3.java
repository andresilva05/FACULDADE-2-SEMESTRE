package exercicios;

//3. Faça um programa em JAVA que divida uma string em palavras e exiba cada
//palavra em uma linha separada.
public class Exercicio3 {
    public static void main(String[] args) {

        // Cria uma string de exemplo
        String frase = new String("Olá boa noite");

        // Usa split(" ") para dividir a string em partes separadas por espaço
        String[] palavra = frase.split(" ");

        // Percorre cada palavra e exibe em uma linha separada
        for (String texto : palavra) {
            System.out.println(texto);
        }
    }
}
