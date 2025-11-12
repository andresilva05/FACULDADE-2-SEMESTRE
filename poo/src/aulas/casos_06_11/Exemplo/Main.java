package casos_06_11.Exemplo;

// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Cria animais diferentes
        Animal a1 = new Cachorro("Rex", 5);
        Animal a2 = new Gato("Mia", 3);

        // Exibe as informações (usa o método toString sobrescrito)
        System.out.println(a1);
        System.out.println(a2);

        // Demonstra o polimorfismo:
        a1.emitirSom(); // Late
        a2.emitirSom(); // Mia

        // Exemplo de uso de membro estático
        System.out.println("Total de animais criados: " + Animal.getTotalAnimais());
    }
}
