package casos_06_11.Exercicio;

// Implementação concreta da fila usando vetor circular
public class CircularQueue extends Queue {

    private static final int MAXSIZE = 100; // Tamanho máximo padrão
    private Client elements[]; // Vetor que armazena os clientes
    private int start; // Posição inicial da fila
    private int end;   // Posição final da fila
    private int size;  // Quantidade atual de elementos
    private int maxsize; // Tamanho máximo definido

    // Construtor padrão (usa o tamanho máximo)
    public CircularQueue() {
        this.maxsize = MAXSIZE;
        init();
    }

    // Construtor que permite definir o tamanho da fila
    public CircularQueue(int size) {
        if (size > 0) {
            this.maxsize = size;
        } else {
            this.maxsize = MAXSIZE;
        }
        init();
    }

    // Adiciona um cliente na fila (enqueue)
    @Override
    boolean enqueue(Client client) {
        if (!isFull()) {
            elements[end] = client;
            end += 1;
            if (end == maxsize) {
                end = 0; // Retorna ao início se chegar no final
            }
            size += 1;
            return true;
        }
        return false;
    }

    // Remove um cliente da fila (dequeue)
    @Override
    Client dequeue() {
        Client client = null;

        if (isEmpty()) {
            return client;
        } else {
            start += 1;
            if (start == maxsize) {
                start = 0;
            }
            client = elements[start];
            elements[start] = null;
            size -= 1;
            return client;
        }
    }

    // Verifica se a fila está cheia
    @Override
    boolean isFull() {
        return size == maxsize;
    }

    // Verifica se a fila está vazia
    @Override
    boolean isEmpty() {
        return size == 0;
    }

    // Inicializa os atributos
    private void init() {
        this.elements = new Client[this.maxsize];
        this.start = -1;
        this.end = 0;
        this.size = 0;
    }
}
