package interface_13_11.exemplos.exemploRelacao;

public class App {
    public static void main(String[] args) {
        Linha linha1 = new Linha(1, 0, 1, 0);
        Linha linha2 = new Linha(1, 0, 1, 0);
        System.out.println(linha1.MaiorQue(linha1, linha2));
        System.out.println(linha1.MenorQue(linha1, linha2));
        System.out.println(linha1.Igual(linha1, linha2));

        System.out.println(linha1.linhasIguais(linha1, linha2));
        System.out.println(linha1.getComprimento());
        System.out.println(linha2.getComprimento());

    }
}
