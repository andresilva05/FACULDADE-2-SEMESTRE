package exemploss.exemplo02;
//
public class Retangulo {

    private double comprimento;

    private double largura;

    Retangulo(double comprimento, double largura) {
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double area() {
        return this.comprimento * this.largura;
    }
}