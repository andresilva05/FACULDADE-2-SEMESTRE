package ClassesAbstratas_16_10.exercicios.exercicio2;

// Classe que representa uma chácara para aluguel
public class Chacara extends Imovel {
    String nome;          // nome da chácara
    int capacidade;       // número máximo de pessoas
    boolean diaDaSemana;  // true = dia de semana, false = fim de semana

    // Construtor que inicializa os atributos
    public Chacara(int id, String endereco, String nome, int capacidade, boolean diaDaSemana) {
        super(id, endereco);
        this.nome = nome;
        this.capacidade = capacidade;
        this.diaDaSemana = diaDaSemana;
    }

    // Implementação do método abstrato de cálculo do aluguel
    @Override
    double calcularAluguel() {
        double taxa;

        // Taxa maior no fim de semana (30) e menor durante a semana (20)
        if (diaDaSemana) {
            taxa = 30.0; // dia de semana
        } else {
            taxa = 20.0; // fim de semana
        }

        // cálculo base + taxa por pessoa
        double aluguel = 600 + (capacidade * taxa);
        return aluguel;
    }

    // Exibe todos os detalhes da chácara
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // exibe dados gerais
        System.out.println("Nome da Chácara: " + nome);
        System.out.println("Quantidade de pessoas: " + capacidade);
        System.out.println("Data: " + (diaDaSemana ? "Semana" : "Final de Semana."));
    }
}
