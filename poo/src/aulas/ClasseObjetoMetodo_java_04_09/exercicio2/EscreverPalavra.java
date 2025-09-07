package ClasseObjetoMetodo_java_04_09.exercicio2; // Pacote onde a classe está localizad

import java.util.Scanner; //Importa a classe Scanner para ler dados do usuário

public class EscreverPalavra {  // Classe principal com método main


    public static void main(String[] args) { // Ponto de entrada do programa


        Caneta caneta = new Caneta(); // Cria um objeto da classe Caneta chamado 'caneta'

        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler entradas do usuário



        System.out.println("\nInforme a cor da caneta: "); // Solicita ao usuário a cor
        caneta.cor = scanner.nextLine(); // Lê a cor digitada e atribui ao atributo 'cor' da caneta

        System.out.println("\nInforme a carga da caneta em quantidade, sendo 50 carga máxima: ");  // Solicita carga
        caneta.carga = scanner.nextInt(); // Lê um número inteiro e atribui ao atributo 'carga'

        System.out.println("\nA caneta está tampada ou destampada (sim/não)"); // Pergunta sobre a tampa
        caneta.tampa = scanner.nextLine(); // Lê a resposta e atribui ao atributo 'tampa'

        System.out.println("\nQual o tipo da caneta (ex.: esferográfica, tinteiro, marca-texto).\n"); // Pergunta tipo

        caneta.tipo = scanner.nextLine(); // Lê o tipo e atribui ao atributo 'tipo'


        caneta.escreverPalavra();

    }
}
