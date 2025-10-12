package exemplos;

public class VerificarSubtring {
    public static void main(String[] args) {
        String str = "Hello world!";
        boolean contem = str.contains("world");
        System.out.println("Contém 'world': " + contem);
    }
}