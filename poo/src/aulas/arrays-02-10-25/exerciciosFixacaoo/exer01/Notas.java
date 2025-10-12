//Elabore um programa que leia as notas de N
//alunos de uma turma, armazenando-as em um
//        vetor. Por fim, exibir a nota de cada aluno que
//foi aprovado (média superior ou igual a 6,0) e
//a nota média geral da t
//
package exerciciosFixacaoo.exer01;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int n = sc.nextInt();

        double[] notas = new double[n];
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nota da pessoa " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        for (int i = 0; i < n; i++) {
            if (notas[i] >= 6.0) {
                System.out.println("\nAluno " + (i + 1) + " aprovado!");
            } else {
                System.out.println("\nAluno " + (i + 1) + " reprovado!");
            }
        }

        double media = soma / n;

        System.out.println("\nNota média geral = " + media);

        sc.close();
    }
}
