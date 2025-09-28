package exercicios.exercicio3;

// Subclasse de ArCondicionado
public class ArAutomotivo extends ArCondicionado {

    // Construtor recebe todos os atributos necessários
    // e passa para o construtor da superclasse (ArCondicionado)
    public ArAutomotivo(int serie, int btu, int voltagem, boolean arQuente) {
        super(serie, btu, arQuente);
    }

    // Aqui só sobrescrevemos o método mostrarDados()
    // Podemos customizar depois se precisar mostrar algo específico de automotivo
    @Override
    public void mostrarDados() {
        super.mostrarDados();  // reaproveita a exibição comum da superclasse
    }
}
