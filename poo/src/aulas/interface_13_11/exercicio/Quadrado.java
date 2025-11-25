package interface_13_11.exercicio;

public class Quadrado implements Area {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }
}
