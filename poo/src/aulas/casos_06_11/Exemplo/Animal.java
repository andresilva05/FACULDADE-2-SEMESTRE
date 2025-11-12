package casos_06_11.Exemplo;

// Arquivo: Animal.java
public abstract class Animal {
    private String nome;
    private int idade;
    private static int totalAnimais = 0; // membro estático (pertence à classe)

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        totalAnimais++; // conta quantos animais foram criados
    }

    // Método abstrato (obrigatório sobrescrever nas classes filhas)
    public abstract void emitirSom();

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Membro estático
    public static int getTotalAnimais() {
        return totalAnimais;
    }

    // Método sobrescrito
    @Override
    public String toString() {
        return "Animal: " + nome + " (" + idade + " anos)";
    }
}
