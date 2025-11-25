package interface_13_11.exercicio;

public class App {

    public static void main(String[] args) {
        Area f1 = new Quadrado(4);
        Area f2 = new Triangulo(3, 5);
        Area f3 = new Circulo(2);

        System.out.println(f1.area());
        System.out.println(f2.area());
        System.out.println(f3.area());

    }
}
