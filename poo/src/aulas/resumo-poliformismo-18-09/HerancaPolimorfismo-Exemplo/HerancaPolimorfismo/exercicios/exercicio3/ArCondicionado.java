package exercicios.exercicio3;

// Classe base com atributos comuns
public class ArCondicionado {

    int serie;          // número de série
    int btu;            // capacidade de refrigeração
    boolean arQuente;   // modo quente ou não

    // Construtor da superclasse
    public ArCondicionado(int serie, int btu, boolean arQuente) {
        this.serie = serie;
        this.btu = btu;
        this.arQuente = arQuente;
    }

    // Método que exibe informações comuns
    public void mostrarDados() {
        System.out.println("\n--------INFORMAÇÕES DO ARCONDICIONADO---------");
        System.out.println("Serie: " + serie);
        System.out.println("BTU: " + btu);

        // verifica se é quente ou só frio
        if (arQuente) {
            System.out.println("TEMPERATURA: AR QUENTE");

        } else {
            System.out.println("TEMPERATURA: AR FRIO");
        }
    }
}
