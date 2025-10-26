package pre_atividade_avaliativa_23_10.Exercicicio;

// Classe filha de Product, representando produtos eletrônicos
public class Eletronicos extends Product {
    String marca;
    int voltagem;

    // Construtor
    public Eletronicos(String name, double price, int quantity, String marca, int voltagem) {
        super(name, price, quantity); // chama o construtor da classe mãe
        this.marca = marca;
        this.voltagem = voltagem;
    }

    // Sobrescreve o método toString para incluir mais informações
    @Override
    public String toString() {
        return super.toString() // usa o toString da classe mãe
                + "\nMarca: " + marca
                + "\nVoltagem: " + voltagem
                + "\n";
    }
}
