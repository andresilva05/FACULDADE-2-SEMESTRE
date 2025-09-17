package EncapsulamentoConstrutores_11_09.exercicios_fixacao.exercicio1;


public class TesteRetangulo {

    public static void main(String[] args) {

        // Criação do objeto Retangulo
        Retangulo retangulo = new Retangulo();

        // Testa se o comprimento e a largura estão dentro do intervalo válido
        // Se algum for inválido, exibe mensagem de erro
        if (!retangulo.setComprimento(30.5) || !retangulo.setLargura(14.6)) {
            System.out.println("Comprimento e Largura precisam está entre 0 e 20.");
        } else {
            // Se ambos forem válidos, calcula e imprime área e perímetro
            System.out.println("Área: " + retangulo.getArea());
            System.out.println("Perímetro: " + retangulo.getPerimetro());
        }
    }
}

