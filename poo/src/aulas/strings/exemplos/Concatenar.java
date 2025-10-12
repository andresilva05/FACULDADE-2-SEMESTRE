package exemplos;

//Concatenar
public class Concatenar {
    public static void main(String[] args) {
        String nome = "Edsger";
        String sobrenome = "Dijkstra";
        String nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);
        nomeCompleto = nome.concat(sobrenome);
        System.out.println(nomeCompleto);
        nomeCompleto = nome.concat(" ".concat(sobrenome));
        System.out.println(nomeCompleto);
        nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);
    }
}