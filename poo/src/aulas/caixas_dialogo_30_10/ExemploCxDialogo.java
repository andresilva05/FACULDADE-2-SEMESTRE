package caixas_dialogo_30_10;

import javax.swing.*;

public class ExemploCxDialogo {
    public static void main(String[] args) {

        // 1️⃣ Mensagem simples
        JOptionPane.showMessageDialog(null, "Olá! Seja bem-vindo à aula.");

        // 2️⃣ Mensagem com título e ícone
        JOptionPane.showMessageDialog(null,
                "Essa é uma mensagem de informação.",
                "Informativo",
                JOptionPane.INFORMATION_MESSAGE);

        // 3️⃣ Caixa de confirmação (Sim/Não)
        int resposta = JOptionPane.showConfirmDialog(null, "Você gosta de Java?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Que bom! 😄");
        } else {
            JOptionPane.showMessageDialog(null, "Vai gostar ainda! 😅");
        }

        // 4️⃣ Entrada de texto
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Prazer em te conhecer, " + nome + "!");

        // 5️⃣ Caixa com várias opções
        Object[] opcoes = {"Herança", "Polimorfismo", "Abstração"};
        Object resposta2 = JOptionPane.showInputDialog(null,
                "Qual conceito de POO você prefere?",
                "Escolha uma opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + resposta2);
    }

}
