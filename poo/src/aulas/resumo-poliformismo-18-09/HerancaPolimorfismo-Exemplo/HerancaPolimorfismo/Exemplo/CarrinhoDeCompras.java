package Exemplo;

public class CarrinhoDeCompras {
    private double total;

    public CarrinhoDeCompras() {
        this.total = 0;
    }

    public void adiciona(Livro livro) {
        System.out.println("Adicionando livro: " + livro);
        this.total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
