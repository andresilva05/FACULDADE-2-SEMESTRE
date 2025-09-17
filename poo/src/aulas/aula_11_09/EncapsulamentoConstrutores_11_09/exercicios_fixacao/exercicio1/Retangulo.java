package EncapsulamentoConstrutores_11_09.exercicios_fixacao.exercicio1;

//1)Crie uma classe Retangulo com os atributos
//comprimento e largura. Forneça métodos set e
//get para o comprimento e a largura. Os
//métodos set devem verificar se o comprimento
//e a largura são números de ponto flutuante
//maiores que 0.0 e menores que 20.0. Forneça
//métodos que calculam o perímetro e a área do
//retângulo. Escreva um programa para testar a
//classe Retangulo.

public class Retangulo {

    // Atributos privados: só podem ser acessados através de getters e setters
    private double comprimento;
    private double largura;

    // Setter para comprimento com validação
    // Retorna true se o valor for válido, false caso contrário
    public boolean setComprimento(double comprimento) {
        if (comprimento >= 0 && comprimento <= 20) {
            this.comprimento = comprimento; // atribui valor ao atributo
            return true; // valor válido
        }
        return false; // valor inválido
    }

    // Getter para comprimento: retorna o valor do atributo
    public double getComprimento() {
        return comprimento;
    }

    // Setter para largura com validação
    // Retorna true se o valor for válido, false caso contrário
    public boolean setLargura(double largura) {
        if (largura >= 0 && largura <= 20) {
            this.largura = largura; // atribui valor ao atributo
            return true; // valor válido
        }
        return false; // valor inválido
    }

    // Getter para largura: retorna o valor do atributo
    public double getLargura() {
        return this.largura;
    }

    // Método para calcular a área do retângulo
    // Multiplica comprimento x largura e retorna o resultado
    double getArea() {
        return this.comprimento * this.largura;
    }

    // Método para calcular o perímetro do retângulo
    // Soma comprimento + largura, multiplica por 2 e retorna
    double getPerimetro() {
        return 2 * (this.comprimento + this.largura);
    }
}
