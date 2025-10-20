package ClassesAbstratas_16_10.exemplo;

public class ExemploClassesAbstratas {

    public static void main(String[] args) {

        Autor autor = new Autor("Joao da Silva", "123", "joao@gmail.com");


        LivroFisico livro = new LivroFisico("POO", autor);

        livro.mostrarDetalhes();

        if (!livro.aplicaDesconto(0.3)) {
            System.out.println("Desconto do livro deve ser inferior a 30%");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook("BD", autor);
        ebook.setValor(50.00);
        ebook.mostrarDetalhes();

        if (!ebook.aplicaDesconto(0.1)) {
            System.out.println("Desconto do e-book deve ser inferior a 15%");
        } else {
            System.out.println("Valor do e-book com desconto: " + ebook.getValor());
        }

        MiniLivro mini = new MiniLivro("Redes pocket", autor);
        mini.setValor(10);
        mini.mostrarDetalhes();

        if (!mini.aplicaDesconto(0.1)) {
            System.out.println("Mini livro não tem desconto.");
        }

    }
}

