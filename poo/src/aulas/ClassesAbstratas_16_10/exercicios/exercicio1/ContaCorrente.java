package ClassesAbstratas_16_10.exercicios.exercicio1;

// Classe que representa uma conta corrente, com limite adicional
public class ContaCorrente extends ContaBancaria {
    private double limite; // Limite disponível além do saldo

    // Construtor
    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    // Sobrescrita do método de saque para considerar o limite
    @Override
    boolean realizaSaque(double saque) {
        // Se o valor for maior que o saldo + limite, não é possível sacar
        if (saque > getSaldo() + limite) {
            return false;

            // Se o saque for menor ou igual ao saldo, subtrai normalmente
        } else if (saque <= getSaldo()) {
            double novoSaldo = getSaldo() - saque;
            setSaldo(novoSaldo);
            return true;

            // Se o saque for maior que o saldo, mas dentro do limite, usa parte do limite
        } else if (saque > getSaldo() && saque <= getSaldo() + limite) {
            double usadoLimite = saque - getSaldo(); // Calcula quanto do limite foi usado
            setSaldo(0); // Zera o saldo
            limite -= usadoLimite; // Reduz o limite disponível
            return true;
        }

        // Caso não entre em nenhuma das condições acima
        return false;
    }

    // Exibe detalhes da conta corrente, incluindo o limite
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(" | Limite disponível: R$" + limite);
    }
}
