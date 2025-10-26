package pre_atividade_avaliativa_23_10.Exercicio;


// Classe abstrata base para todos os produtos
public abstract class Product {

    // Atributos básicos comuns a todos os produtos
    private String name;
    private double price;
    private int quantity;

    // Construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Retorna o nome em maiúsculas
    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calcula o valor total em estoque (preço × quantidade)
    public double totalValueInStock() {
        return price * quantity;
    }

    // Adiciona unidades ao estoque
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // Remove unidades do estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Representação textual do produto
    public String toString() {
        return name + ", $ " + price + ", " + quantity;
    }
}
