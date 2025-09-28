package Exemplo;

public class Ebook extends Livro {
    private String watermark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        this.setValor(this.getValor() - this.getValor() * porcentagem);
        return true;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
