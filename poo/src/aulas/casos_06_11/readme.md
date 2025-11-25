# Introdução a Orientação a Objetos - INOO
# Laboratório de Programação

Este roteiro de implementação é referente ao problema de Fila de Atendimento.

## Client
O `Client` é a abstração da pessoa que necessita de atendimento pela instituição. O `Client` define a nova senha (`ticketNumber`), inclusive o mecanismo para gerar as novas senhas. Além disso, essa classe define como é feita a transformação do objeto em uma String (`toString()`).

```java
public class Client {
	private static int LAST_TICKET = 1;
	
	private int ticketNumber;
	private boolean isPriority;
	
	public Client() {
		updateLastTicket();
		ticketNumber = LAST_TICKET;
		isPriority = false;
	}
	
	public Client(boolean isPriority) {
		this();
		this.isPriority = isPriority;
	}
	
	@Override
	public String toString() {
		String str;
		if(isPriority) {
			str = "P-";
		} else {
			str = "C-";
		}
		if (ticketNumber < 10) {
			str += "00" + getTicketNumber();
		} else if (ticketNumber < 100) {
			str += "0" + getTicketNumber();
		} else {
			str += getTicketNumber();
		}
		return str;
	}
	
	public int getTicketNumber() {
		return ticketNumber;
	}

	public boolean isPriority() {
		return isPriority;
	}

	private void updateLastTicket() {
		LAST_TICKET += 1;
	}
}
```

## Queue
Queue é uma classe abstrata que define a interface que uma fila concreta deve implementar. Nessa classe são definidos todos os métodos que qualquer fila deve implementar, independente da tecnologia de implementação aplicada.

```java
public abstract class Queue {

	abstract boolean enqueue(Client client);
	
	abstract Client dequeue();
	
	abstract boolean isFull();
	
	abstract boolean isEmpty();
	
}
```

## CircularQueue
Essa é uma implementação concreta da classe abstrata `Queue`. A `CircularQueue` herda as características da classe `Queue` e deve implementar, usando mecanismo de sobrescrita, todos os métodos abstratos definidos em `Queue`. Nessa implementação adotou-se que a fila é armazenanda em um array (vetor) circular com tamanho previamente definido.

```java
public class CircularQueue extends Queue {
	
	private static final int MAXSIZE = 100;
	private Client elements[];
	private int start;
	private int end;
	private int size;
	private int maxsize;

	public CircularQueue() {
		this.maxsize = MAXSIZE;
		init();
	}
	
	public CircularQueue(int size) {
		if (size > 0) {
			this.maxsize = size;
		} else {
			this.maxsize = MAXSIZE;
		}
		init();
	}
	
	@Override
	boolean enqueue(Client client) {
		if (!isFull()) {
			elements[end] = client;
			end += 1;
			if (end == maxsize) {
				end = 0;
			}
			size += 1;
			return true;
		}
		return false;
	}

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

	@Override
	boolean isFull() {
		return size == maxsize;
	}

	@Override
	boolean isEmpty() {
		return size == 0;
	}

	private void init() {
		this.elements = new Client[this.maxsize];
		this.start = -1;
		this.end = 0;
		this.size = 0;
	}
}
```

## Counter
Essa classe representa o caixa ou guichê de atendimento. Apenas temos como atributo o número do caixa. Esse dado é importante para indicar para qual caixa o cliente deve se dirigir para ser atendido.

```java
public class Counter {
	private int number;

	public Counter(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

}
```

## PriorityCounter
Essa classe é exatamente um caixa/guichê (`Counter`), porém em uma classe que indica que esse `Counter` pode atender clientes da fila prioritária.

```java
public class PriorityCounter extends Counter {

	public PriorityCounter(int number) {
		super(number);
	}
	
}
```

## ManageService
Essa classe representa a funcionalidade do sistema. Aqui são instanciadas as filas e são disponibilizadas as operações de inserir um novo cliente na fila como a de chamar os clientes da fila.

```java
public class ManageService {
	
	private Queue defaultQueue;
	private Queue priorityQueue;

	
	public ManageService() {
		defaultQueue = new CircularQueue(20);
		priorityQueue = new CircularQueue(10);
	}
	
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
	
	public String callClient(Counter counter) {
		Client client = null;
		Queue queue;
		
		if (counter instanceof PriorityCounter) {
			queue = priorityQueue;
			if (queue.isEmpty()) {
				queue = defaultQueue;
			}
		} else {
			queue = defaultQueue;
		}
		
		client = queue.dequeue();
		if ( client != null ) {
			return String.format("Senha : %s\ndirija-se ao\nCaixa n.º %d.\n", client.toString(), counter.getNumber());
		} else {
			return "Não existem clientes na fila.";
		}
	}
	
	private String insert(Queue queue, Client client, String queueName) {
		if (queue.enqueue(client)) {
			return "Senha: " + client.toString();
		} else {
			return "Não há espaço na fila " + queueName + ". Volte mais tarde.";
		}
	}
}
```

## ClientCode
Essa classe possui como responsabilidade a interação com o usuário. Ela hospeda o método `main()` e outros métodos que atuam com a coleta de dados. Importante onbservar que essa classe não possui **regra de negócio**, apenas organiza entradas e saídas.

```java
import javax.swing.JOptionPane;

public class ClientCode {

	private static final String TITLE = "Controle de Atendimento INOO";
	
	public static void main(String[] args) {
		
		ManageService manager = new ManageService();
		
		String output = "";
		int option;
		
		do {
			option = options();
			if (option == 1) {
				output = manager.includeClient(false);
			} else if (option == 2) {
				output = manager.includeClient(true);
			} else if (option == 3) {
				Counter counter = readConter();
				output = manager.callClient(counter);
			} else {
				output = "Obrigado por utilizar um sistema INOO";
			}
			
			showMessage(output);
		} while (option != 0);

	}

	private static void showMessage(String output) {
		JOptionPane.showMessageDialog(null, 
				output,
				TITLE,
				JOptionPane.INFORMATION_MESSAGE);
	}

	private static Counter readConter() {
		String input = JOptionPane.showInputDialog(null,
				"Número do Caixa:",
				TITLE,
				JOptionPane.QUESTION_MESSAGE);
		
		int number = Integer.parseInt(input);
		
		int counterType = JOptionPane.showConfirmDialog(null,
				"É um caixa de atendimento proferencial?",
				TITLE,
				JOptionPane.YES_NO_OPTION);
		
		if (counterType == 0) {
			return new PriorityCounter(number);
		} else {
			return new Counter(number);
		}
		
	}

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