package exerciciosFixacaoo.exer02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante[] quartos = new Estudante[10];

        System.out.print("Quantos estudantes irão alugar quartos? ");
        int n = sc.nextInt();
        sc.nextLine(); // consomee o \n deixado pelo nextInt

        for (int i = 1; i <= n; i++) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Quarto desejado de (0 a 9)");
            int quarto = sc.nextInt();
            sc.nextLine(); // evita problema na próxima leitura

            if (quarto < 0 || quarto > 9) {
                System.out.println("Número do quarto inválido!");
            } else if (quartos[quarto] != null) {
                System.out.println("Quarto já ocupado!");
            } else {
                quartos[quarto] = new Estudante(nome, email);
            }


        }

        System.out.println("\nRelatório de quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println("Quarto " + i + " alugado para: " + quartos[i].getNome() + ", " + quartos[i].getEmail());

            }
        }

        System.out.println("\nRelatório de ocupação dos quartos:");

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println("Quarto " + i + " alugado para: " + quartos[i].getNome() + ", " + quartos[i].getEmail());
            } else {
                System.out.println("Quarto " + i + " disponível");
            }
        }

    }
}
