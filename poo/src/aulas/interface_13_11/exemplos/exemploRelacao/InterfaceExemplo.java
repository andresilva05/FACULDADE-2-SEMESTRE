package interface_13_11.exemplos.exemploRelacao;

public class InterfaceExemplo {
        public static void main(String[] args) {
           Linha linha1 = new Linha(0,0,8,8);
           Linha linha2 = new Linha(1,1,9,9);
           System.out.println(linha1.MaiorQue(linha1, linha2));
           System.out.println(linha1.MenorQue(linha1, linha2));
           System.out.println(linha1.Igual(linha1, linha2));
       
    }
    
}
