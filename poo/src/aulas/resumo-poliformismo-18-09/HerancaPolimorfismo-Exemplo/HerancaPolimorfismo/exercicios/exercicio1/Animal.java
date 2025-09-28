package exercicios.exercicio1;

public class Animal {

    String nome;
    int idade;

    public Animal(String nome, int idade) { // construtor
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}
