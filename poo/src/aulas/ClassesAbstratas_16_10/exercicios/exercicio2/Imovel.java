package ClassesAbstratas_16_10.exercicios.exercicio2;

// Classe abstrata que representa um imóvel genérico
public abstract class Imovel {

    // Atributos comuns a todos os imóveis
    private int id;
    private String endereco;
    private boolean ocupado = false; // indica se o imóvel está alugado

    // Método abstrato que será implementado pelas subclasses
    abstract double calcularAluguel();

    // Construtor: define id e endereço
    public Imovel(int id, String endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    // Exibe os dados básicos do imóvel
    public void mostrarDetalhes() {
        System.out.println("\n=== Dados do Imóvel ===");
        System.out.println("ID: " + id);
        System.out.println("Endereço: " + endereco);
        System.out.println("Status: " + (ocupado ? "Alugado" : "Disponível"));
    }
}
