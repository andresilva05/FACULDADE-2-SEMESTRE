package ClassesAbstratas_16_10.exercicios.exercicio2;

// Classe que representa uma loja comercial
public class LojaComercial extends Imovel {
    private int tamanho; // tamanho da loja em m²

    // Construtor que recebe os dados e chama o construtor da superclasse
    public LojaComercial(int id, String endereco, int tamanho) {
        super(id, endereco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    // Implementação do método abstrato calcularAluguel()
    @Override
    double calcularAluguel() {
        // R$300 por metro quadrado
        double aluguel = tamanho * 300;
        return aluguel;
    }

    // Mostra os detalhes da loja comercial
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tamanho: " + tamanho + "²");
    }
}
