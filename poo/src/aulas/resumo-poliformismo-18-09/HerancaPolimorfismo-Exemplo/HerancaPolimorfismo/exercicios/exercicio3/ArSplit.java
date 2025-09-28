package exercicios.exercicio3;

// ArSplit é um tipo de ArParede
public class ArSplit extends ArParede {

    // Construtor recebe tudo que ArParede precisa
    public ArSplit(int serie, int btu, boolean arQuente, int voltagem, String cor, boolean controleRemoto) {
        super(serie, btu, arQuente, voltagem, cor, controleRemoto);
    }

    // Também sobrescreve mostrarDados, mas reaproveita tudo da superclasse
    @Override
    public void mostrarDados() {
        super.mostrarDados(); // chama a versão da classe ArParede
    }
}
