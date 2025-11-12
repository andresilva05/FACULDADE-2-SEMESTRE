package casos_06_11.Exemplo;

// Arquivo: Gato.java
public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando: Miau!");
    }

    @Override
    public String toString() {
        return "Gato: " + getNome() + " - Idade: " + getIdade();
    }
}
