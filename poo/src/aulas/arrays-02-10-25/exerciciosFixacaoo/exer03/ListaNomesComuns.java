package exerciciosFixacaoo.exer03;  // Declaração do pacote onde o programa está

import java.util.Scanner;  // Importa a classe Scanner para ler dados do usuário

public class ListaNomesComuns {  // Declaração da classe principal

    public static void main(String[] args) {  // Método principal, ponto de entrada do programa

        Scanner sc = new Scanner(System.in);  // Cria um objeto Scanner para ler a entrada do usuário

        // Pergunta quantos nomes serão adicionados na primeira lista
        System.out.print("Quantos nomess irá adicionar na primeira lista? ");
        int nomesLista1 = sc.nextInt();  // Lê um número inteiro do usuário
        sc.nextLine(); // Consome o \n deixado peloo nextInt para não atrapalhar próximas leituras

        String[] lista1 = new String[nomesLista1];  // Cria um array de strings com o tamanho informado para a primeira lista

        // Pergunta quantos nomes serão adicionados na segunda lista
        System.out.print("\nQuantos nomes irá adicionar na segunda lista? ");
        int nomesLista2 = sc.nextInt();  // Lê um número inteiro do usuário
        sc.nextLine(); // Consome o \n deixado pelo nextInt

        String[] lista2 = new String[nomesLista2];  // Cria um array de strings para a segunda lista

        String[] listaComum = new String[nomesLista1 + nomesLista2];
        // Cria um array que poderá armazenar todos os nomes comuns possíveis
        // O tamanho é a soma dos dois arrays para garantir espaço suficiente

        int indiceComum = 0;  // Índice que será usado para controlar a próxima posição livre da listaComum

        // Preenche a primeira lista com os nomes informados pelo usuário
        for (int i = 0; i < nomesLista1; i++) {
            System.out.print((i + 1) + "°" + " pessoa da Lista 1: ");
            lista1[i] = sc.nextLine();  // Lê o nome digitado e armazena na posição i do array
        }

        System.out.print("\n");  // Pula uma linha para organizar a saída

        // Preenche a segunda lista com os nomes informados pelo usuário
        for (int i = 0; i < nomesLista2; i++) {
            System.out.print((i + 1) + "°" + " pessoa da Lista 2: ");
            lista2[i] = sc.nextLine();  // Lê o nome digitado e armazena na posição i do array
        }

        // Compara cada nome da primeira lista com todos os nomes da segunda lista
        for (int i = 0; i < nomesLista1; i++) {

            for (int j = 0; j < nomesLista2; j++) {
                if (lista1[i].equals(lista2[j])) {
                    // Se o nome da lista1 for igual ao nome da lista2, ou seja, é um nome comum
                    listaComum[indiceComum] = lista1[i];  // Armazena esse nome na listaComum
                    indiceComum++;  // Incrementa o índice para a próxima posição livre
                }
            }

        }

        // Exibe os nomes que são comuns às duas listas
        System.out.println("\nNomes comuns: ");
        for (int i = 0; i < indiceComum; i++) {  // Percorre somente até o último índice usado
            System.out.println(listaComum[i]);  // Imprime cada nome comum
        }

    }  // Fim do método main

}  // Fim da classe
