package ClassesAbstratas_16_10.exercicios.exercicio2;

// Classe que representa um apartamento
public class Apartamento extends Imovel {
    private int quartos; // número de quartos
    private double valorCondominio; // valor do condomínio mensal

    // Construtor que inicializa atributos herdados e específicos
    public Apartamento(int id, String endereco, int quartos, double valorCondominio) {
        super(id, endereco); // chama o construtor da superclasse (Imovel)
        this.quartos = quartos;
        this.valorCondominio = valorCondominio;
    }

    // Setter e getter para o valor do condomínio
    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    // Implementação do método abstrato calcularAluguel()
    @Override
    double calcularAluguel() {
        // cálculo: R$200 por quarto + valor do condomínio
        double aluguel = quartos * 200 + valorCondominio;
        return aluguel;
    }

    // Mostra os detalhes do apartamento
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // exibe informações básicas do imóvel
        System.out.println("Quartos: " + quartos);
        System.out.println("Valor Condomínio: R$" + String.format("%.2f", valorCondominio));
    }
}
