package interface_13_11.exemplo;

public class App {
    public static void main(String[] args) {

        // Polimorfismo: mesmas chamadas, comportamentos diferentes
        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        System.out.println("--- Testando Carro ---");
        v1.acelerar();
        v1.frear();

        System.out.println("\n--- Testando Bicicleta ---");
        v2.acelerar();
        v2.frear();
    }
}
