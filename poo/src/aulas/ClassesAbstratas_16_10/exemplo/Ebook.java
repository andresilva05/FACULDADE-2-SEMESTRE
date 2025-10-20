package ClassesAbstratas_16_10.exemplo;

public class Ebook extends Livro {
    public Ebook(String nome, Autor autor) {
        super(nome, autor);
    }

    private String watermark;

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    boolean aplicaDesconto(double porcentagem) {
        if (porcentagem >= 0.15) {
            return false;
        }
        this.valor -= this.getValor() * porcentagem;
        return true;
    }

}
