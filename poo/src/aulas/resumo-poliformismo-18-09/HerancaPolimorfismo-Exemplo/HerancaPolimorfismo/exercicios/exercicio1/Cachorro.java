package exercicios.exercicio1;

public class Cachorro extends Animal {

    // Construtor
    public Cachorro(String nome, int idade) {
        super(nome, idade); // chama o construtor da superclasse
    }

    // Método específico
    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }

    // Comportamento extra da subclasse
    public void correr() {
        System.out.println("O cachorro está correndo");
    }
}
