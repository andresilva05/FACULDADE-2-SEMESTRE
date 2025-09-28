package exercicios.exercicio1;

public class Preguica extends Animal {

    // Construtor
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescreve emitirSom
    @Override
    public void emitirSom() {
        System.out.println("Grunhir");
    }

    // Método específico da preguiça
    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em árvores");
    }
}
