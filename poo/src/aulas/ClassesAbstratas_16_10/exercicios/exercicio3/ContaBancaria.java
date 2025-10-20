package ClassesAbstratas_16_10.exercicios.exercicio3;

// Classe abstrata que serve como modelo para tipos de conta (Corrente e Poupança)
public abstract class ContaBancaria {

    // Atributos comuns a todas as contas
    private int numero;
    private String titular;
    private double saldo;

    // Métodos getters e setters
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

    // Método padrão para saque — pode ser sobrescrito nas subclasses
    boolean realizaSaque(double saque) {
        if (saque > saldo) { // verifica se há saldo suficiente
            return false; // não há saldo
        }
        this.saldo -= saque; // subtrai valor sacado do saldo
        return true; // saque realizado com sucesso

        // System.out.println("Saque de R$" + saque + "realizado com sucesso."); // linha comentada
    }

    // Método padrão para depósito — pode ser usado por todas as contas
    boolean realizaDeposito(double deposito) {
        if (deposito <= 0.0) { // impede depósitos negativos ou zero
            return false;
        }

        saldo += deposito; // adiciona valor ao saldo
        return true; // depósito bem-sucedido
    }

    // Construtor: define número, titular e saldo inicial
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular.toUpperCase(); // converte nome para maiúsculas
        this.saldo = saldo;
    }

    // Exibe informações básicas da conta
    public void mostrarDetalhes() {
        System.out.println("Número da conta: " + numero +
                " | Titular: " + titular +
                " | Saldo atual: R$" + saldo);
    }

}
