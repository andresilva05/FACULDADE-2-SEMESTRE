package casos_06_11.Exercicio;

public abstract class Queue {
// Classe abstrata que define a estrutura de uma fila

    // Método para adicionar um cliente na fila
    abstract boolean enqueue(Client client);

    // Método para remover um cliente da fila
    abstract Client dequeue();

    // Verifica se a fila está cheia
    abstract boolean isFull();

    // Verifica se a fila está vazia
    abstract boolean isEmpty();
}
