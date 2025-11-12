package casos_06_11.Exercicio;

// Classe principal que interage com o usuário

import javax.swing.JOptionPane;

public class ClientCode {

    private static final String TITLE = "Controle de Atendimento INOO";

    public static void main(String[] args) {

        ManageService manager = new ManageService(); // Gerenciador do sistema
        String output = "";
        int option;

        // Loop principal do sistema
        do {
            option = options(); // Mostra o menu
            if (option == 1) {
                output = manager.includeClient(false); // Cliente normal
            } else if (option == 2) {
                output = manager.includeClient(true); // Cliente preferencial
            } else if (option == 3) {
                Counter counter = readConter(); // Lê o número do caixa
                output = manager.callClient(counter); // Chama o cliente
            } else {
                output = "Obrigado por utilizar um sistema INOO";
            }

            showMessage(output);
        } while (option != 0); // Encerra quando o usuário escolhe sair
    }

    // Mostra uma mensagem na tela
    private static void showMessage(String output) {
        JOptionPane.showMessageDialog(null,
                output,
                TITLE,
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Lê o número e o tipo de caixa
    private static Counter readConter() {
        String input = JOptionPane.showInputDialog(null,
                "Número do Caixa:",
                TITLE,
                JOptionPane.QUESTION_MESSAGE);

        int number = Integer.parseInt(input);

        int counterType = JOptionPane.showConfirmDialog(null,
                "É um caixa de atendimento preferencial?",
                TITLE,
                JOptionPane.YES_NO_OPTION);

        if (counterType == 0) {
            return new PriorityCounter(number); // Caixa preferencial
        } else {
            return new Counter(number); // Caixa normal
        }
    }

    // Mostra o menu de opções
    private static int options() {
        Object optionArr[] = {
                "Nova senha normal",
                "Nova senha preferencial",
                "Chamar cliente",
                "Encerrar o sistema"
        };

        String response = (String) JOptionPane.showInputDialog(null,
                "Selecione uma opção no menu",
                TITLE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionArr,
                optionArr[2]);

        if (optionArr[0].equals(response)) {
            return 1;
        } else if (optionArr[1].equals(response)) {
            return 2;
        } else if (optionArr[2].equals(response)) {
            return 3;
        } else {
            return 0;
        }
    }
}
