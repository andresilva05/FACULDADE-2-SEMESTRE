package exercicios.exercicio3;

public class Main {
    public static void main(String[] args) {

        // Criamos os objetos usando as subclasses corretas
        // Note que os dois primeiros são do tipo ArAutomotivo
        ArCondicionado ac1 = new ArAutomotivo(1, 7500, 110, false);
        ArCondicionado ac2 = new ArAutomotivo(2, 15000, 110, true);

        // ArParede tem mais atributos (cor, voltagem, controleRemoto)
        ArParede ac3 = new ArParede(3, 5000, true, 110, "Branca", false);

        // ArSplit herda de ArParede, então também tem os atributos extras
        ArSplit ac4 = new ArSplit(4, 10000, true, 110, "Preta", false);

        // Chamamos o método polimórfico mostrarDados()
        ac1.mostrarDados();
        ac2.mostrarDados();
        ac3.mostrarDados();
        ac4.mostrarDados();
    }
}
