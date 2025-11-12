package casos_06_11.Exercicio;

// Classe que representa o cliente que precisa de atendimento
public class Client {
    // Atributo estático para controlar o número da última senha gerada
    private static int LAST_TICKET = 1;

    // Número da senha do cliente
    private int ticketNumber;
    // Indica se o cliente é prioritário (true = sim)
    private boolean isPriority;

    // Construtor padrão (cliente normal)
    public Client() {
        updateLastTicket(); // Atualiza o último número de senha
        ticketNumber = LAST_TICKET; // A senha do cliente atual
        isPriority = false; // Por padrão, o cliente não é prioritário
    }

    // Construtor para cliente preferencial
    public Client(boolean isPriority) {
        this(); // Chama o construtor padrão
        this.isPriority = isPriority; // Define o tipo de cliente
    }

    // Método que define como o cliente será exibido como texto
    @Override
    public String toString() {
        String str;
        if (isPriority) {
            str = "P-"; // P = preferencial
        } else {
            str = "C-"; // C = comum
        }

        // Formata o número da senha com zeros à esquerda
        if (ticketNumber < 10) {
            str += "00" + getTicketNumber();
        } else if (ticketNumber < 100) {
            str += "0" + getTicketNumber();
        } else {
            str += getTicketNumber();
        }

        return str;
    }

    // Retorna o número da senha
    public int getTicketNumber() {
        return ticketNumber;
    }

    // Retorna se é preferencial
    public boolean isPriority() {
        return isPriority;
    }

    // Atualiza o último número de senha (incrementa)
    private void updateLastTicket() {
        LAST_TICKET += 1;
    }
}
