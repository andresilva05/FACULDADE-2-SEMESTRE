package interface_13_11.exemplo;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando com pedal!");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando com os freios manuais!");
    }
}
