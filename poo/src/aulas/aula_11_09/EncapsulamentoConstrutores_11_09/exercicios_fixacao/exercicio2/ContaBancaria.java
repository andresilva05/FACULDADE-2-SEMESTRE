package EncapsulamentoConstrutores_11_09.exercicios_fixacao.exercicio2;

//) Em um banco, para se cadastrar uma conta bancária, é
//necessário informar o número da conta e o nome do titular
//da conta. Importante: uma vez que uma conta bancária foi
//aberta, o número da conta nunca poderá ser alterado. Já o
//nome do titular pode ser alterado. Por fim, o saldo da conta
//não pode ser alterado livremente. É preciso haver um
//mecanismo para proteger isso. O saldo só aumenta por meio
//        de depósitos, e só diminui por meio de saques. Nota: a conta
//não pode ficar com saldo negativo; deve ser lançada uma
//exceção caso isso ocorra. Faça um programa que realize o
//cadastro de uma conta. Em seguida, realize um depósito e
//depois um saque, sempre mostrando os dados da conta após
//cada operação.


// Classe que representa uma conta bancária
public class ContaBancaria {

    // Atributos privados para proteger os dados
    private int numeroConta = 1234; // Número da conta imutável
    private String nome = "André";  // Nome do titular, pode ser alterado
    private double saldoConta = 0;  // Saldo da conta, só alterado por métodos

    // Setter para alterar o nome do titular
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obter o nome do titular
    public String getNome() {
        return nome;
    }

    // Getter para obter o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Getter para obter o saldo da conta
    public double getSaldoConta() {
        return saldoConta;
    }

    // Método para depositar dinheiro na conta
    boolean depositar(double deposito) {
        if (deposito > 0) { // Valida se o depósito é positivo
            this.saldoConta = saldoConta + deposito; // Atualiza saldo
            return true; // Depósito realizado com sucesso
        }
        return false; // Depósito inválido
    }

    // Método para sacar dinheiro da conta
    boolean sacarDinheiro(double valorSaque) {
        if (saldoConta > valorSaque) { // Verifica se há saldo suficiente
            this.saldoConta = saldoConta - valorSaque; // Atualiza saldo
            return true; // Saque realizado com sucesso
        }
        return false; // Saldo insuficiente
    }
}