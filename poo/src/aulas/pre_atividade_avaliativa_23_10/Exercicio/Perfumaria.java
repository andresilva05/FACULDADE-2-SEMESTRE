package pre_atividade_avaliativa_23_10.Exercicio;


// Classe filha de Product, representando produtos de perfumaria
public class Perfumaria extends Product {
    String publico;
    String marca;
    int volume;

    // Construtor
    public Perfumaria(String name, double price, int quantity, String publico, String marca, int volume) {
        super(name, price, quantity); // chama o construtor da classe mãe
        this.publico = publico;
        this.marca = marca;
        this.volume = volume;
    }

    // Sobrescreve o método toString para exibir mais detalhes
    @Override
    public String toString() {
        return super.toString()
                + "\nPúblico: " + publico
                + "\nMarca: " + marca
                + "\nVolume: " + volume
                + "\n";
    }
}
