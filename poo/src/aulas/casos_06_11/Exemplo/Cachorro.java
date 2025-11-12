package casos_06_11.Exemplo;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo: Au au!");
    }

    @Override
    public String toString() {
        return "Cachorro: " + getNome() + " - Idade: " + getIdade();
    }
}
