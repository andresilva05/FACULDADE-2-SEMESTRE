package ClassesAbstratas_16_10.exercicios.exercicio1;

// Classe que representa uma conta poupança, que segue as regras padrão
public class ContaPoupanca extends ContaBancaria {

    // Construtor
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    // Não é necessário sobrescrever métodos aqui, pois a poupança usa as regras padrão
}
