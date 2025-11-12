package casos_06_11.Exercicio;

// Classe que faz o gerenciamento das filas e do atendimento
public class ManageService {

    private Queue defaultQueue;   // Fila normal
    private Queue priorityQueue;  // Fila preferencial

    // Construtor: cria as duas filas
    public ManageService() {
        defaultQueue = new CircularQueue(20);
        priorityQueue = new CircularQueue(10);
    }

    // Inclui um novo cliente na fila
    public String includeClient(boolean isPriority) {
        String str;
        Client client = new Client(isPriority);

        if (client.isPriority()) {
            str = insert(priorityQueue, client, "prioritária");
        } else {
            str = insert(defaultQueue, client, "normal");
        }
        return str;
    }

    // Chama o próximo cliente de acordo com o tipo de caixa
    public String callClient(Counter counter) {
        Client client = null;
        Queue queue;

        // Se for um caixa prioritário, tenta chamar primeiro da fila preferencial
        if (counter instanceof PriorityCounter) {
            queue = priorityQueue;
            if (queue.isEmpty()) {
                queue = defaultQueue; // Se a fila preferencial estiver vazia, chama da normal
            }
        } else {
            queue = defaultQueue;
        }

        client = queue.dequeue();

        if (client != null) {
            return String.format("Senha : %s\ndirija-se ao\nCaixa n.º %d.\n",
                    client.toString(), counter.getNumber());
        } else {
            return "Não existem clientes na fila.";
        }
    }

    // Método auxiliar para inserir o cliente na fila
    private String insert(Queue queue, Client client, String queueName) {
        if (queue.enqueue(client)) {
            return "Senha: " + client.toString();
        } else {
            return "Não há espaço na fila " + queueName + ". Volte mais tarde.";
        }
    }
}

