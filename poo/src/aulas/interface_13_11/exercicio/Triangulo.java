package interface_13_11.exercicio;

public class Triangulo implements Area {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura) / 2.0;
    }
}
