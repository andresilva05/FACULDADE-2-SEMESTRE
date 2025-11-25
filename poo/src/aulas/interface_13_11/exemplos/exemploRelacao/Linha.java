package interface_13_11.exemplos.exemploRelacao;

public class Linha implements Relacao {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Linha(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getComprimento() {
        double comprimento = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return comprimento;
    }

    public boolean MaiorQue(Object a, Object b) {
        double aComp = ((Linha) a).getComprimento();
        double bComp = ((Linha) b).getComprimento();
        return (aComp > bComp);
    }

    public boolean MenorQue(Object a, Object b) {
        double aComp = ((Linha) a).getComprimento();
        double bComp = ((Linha) b).getComprimento();
        return (aComp < bComp);
    }

    public boolean Igual(Object a, Object b) {
        double aComp = ((Linha) a).getComprimento();
        double bComp = ((Linha) b).getComprimento();
        return (aComp == bComp);
    }

    public boolean linhasIguais(Object a, Object b) {

        if (Linha.this.x1 == Linha.this.x2 && Linha.this.y1 == Linha.this.y2) {
            return true;
        }
        return false;

    }
}
