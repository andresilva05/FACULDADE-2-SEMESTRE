package exercicios;

//6. Comparação de strings sem distinção entre maiúsculas e minúsculas
//Escreva um programa Java para comparar duas strings lexicograficamente, ignorando
//diferenças entre maiúsculas e minúsculas.
//Saída de exemplo:
//String 1: Este é o exercício 1
//String 2: Este é o Exercício 1
//        "Este é o exercício 1" é igual a "Este é o Exercício 1"

public class Exercicio5 {
    public static void main(String[] args) {

        // Cria duas strings e converte ambas para minúsculas
        // Isso garante que a comparação ignore maiúsculas/minúsculas
        String str = new String("Este é o Exercício 1").toLowerCase();
        String str2 = new String("Este é o ExeRcício 2").toLowerCase();

        // compareTo compara lexicograficamente (ordem alfabética)
        int lexicograficamente = str.compareTo(str2);

        // Se o resultado for 0, as strings são iguais
        if (lexicograficamente == 0) {
            System.out.println("As Strings são lexicograficamente iguais");

            // Se for maior que 0, a primeira vem depois da segunda na ordem alfabética
        } else if (lexicograficamente > 0) {
            System.out.println(str + " é maior que " + str2);

            // Se for menor que 0, a primeira vem antes da segunda
        } else {
            System.out.println(str2 + " é maior que " + str);
        }
    }
}
