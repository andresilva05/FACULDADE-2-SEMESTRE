package interface_13_11.exercicio;

public class Circulo implements Area {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }
}
