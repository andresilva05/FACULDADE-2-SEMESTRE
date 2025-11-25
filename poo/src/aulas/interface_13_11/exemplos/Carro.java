package interface_13_11.exemplo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando com motor!");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando com ABS!");
    }
}
