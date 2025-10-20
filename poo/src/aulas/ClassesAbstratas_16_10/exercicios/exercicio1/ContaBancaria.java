package ClassesAbstratas_16_10.exercicios.exercicio1;

// Classe abstrata base que representa uma conta bancária genérica
public abstract class ContaBancaria {

    // Atributos comuns a todas as contas
    private int numero;
    private String titular;
    private double saldo;

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método de saque genérico (pode ser sobrescrito nas subclasses)
    boolean realizaSaque(double saque) {
        // Se o valor solicitado for maior que o saldo, o saque não é possível
        if (saque > saldo) {
            return false;
        }
        // Caso contrário, o valor é subtraído do saldo
        this.saldo -= saque;
        return true;
    }

    // Método de depósito genérico
    boolean realizaDeposito(double deposito) {
        // Impede depósito de valores nulos ou negativos
        if (deposito <= 0.0) {
            return false;
        }

        // Soma o depósito ao saldo atual
        saldo += deposito;
        return true;
    }

    // Construtor da conta bancária
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular.toUpperCase(); // Armazena o nome em maiúsculas
        this.saldo = saldo;
    }

    // Exibe informações da conta
    public void mostrarDetalhes() {
        System.out.println("Número da conta: " + numero +
                " | Titular: " + titular +
                " | Saldo atual: R$" + saldo);
    }
}
