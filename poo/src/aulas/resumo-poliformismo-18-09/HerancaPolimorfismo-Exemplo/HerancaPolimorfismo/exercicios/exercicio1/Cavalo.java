package exercicios.exercicio1;

public class Cavalo extends Animal {

    // Construtor
    public Cavalo(String nome, int idade) {
        super(nome, idade); // chama o construtor da superclasse
    }

    @Override

    public void emitirSom() {
        System.out.println("Relinchar");
    }

    // Comportamento extra da subclasse
    public void correr() {
        System.out.println("O cavalo está correndo");
    }
}
