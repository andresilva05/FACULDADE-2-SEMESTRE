package ClassesAbstratas_16_10.exercicios.exercicio3;

// Classe que representa uma conta corrente (com limite)
public class ContaCorrente extends ContaBancaria {
    private double limite; // valor do limite disponível para saque

    // Construtor da classe, chamando o construtor da classe mãe (super)
    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo); // inicializa atributos herdados
        this.limite = limite; // define limite inicial
    }

    // Sobrescrita do método de saque para incluir o limite
    @Override
    boolean realizaSaque(double saque) {
        // Caso 1: valor maior que saldo + limite → saque não permitido
        if (saque > getSaldo() + limite) {
            return false;
        }
        // Caso 2: valor dentro do saldo → saque normal
        else if (saque <= getSaldo()) {
            double novoSaldo = getSaldo() - saque;
            setSaldo(novoSaldo);
            return true;
        }
        // Caso 3: saque maior que saldo, mas dentro do limite
        else if (saque > getSaldo() && saque <= getSaldo() + limite) {
            double usadoLimite = saque - getSaldo(); // parte usada do limite
            setSaldo(0); // saldo fica zerado
            limite -= usadoLimite; // reduz limite restante
            return true;
        }

        // Caso não atenda nenhuma condição (em teoria não ocorre)
        return false;
    }

    // Exibe detalhes da conta + o limite atual
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // mostra dados básicos da conta
        System.out.println(" | Limite disponível: R$" + limite);
    }
}
