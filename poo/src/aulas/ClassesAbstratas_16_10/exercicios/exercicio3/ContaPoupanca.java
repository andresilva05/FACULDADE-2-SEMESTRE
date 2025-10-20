package ClassesAbstratas_16_10.exercicios.exercicio3;

// Classe que representa uma conta poupança (sem limite)
public class ContaPoupanca extends ContaBancaria {

    // Construtor chama apenas o construtor da classe mãe
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo); // inicializa número, titular e saldo
    }

    // Não há métodos adicionais porque herda tudo de ContaBancaria
}
