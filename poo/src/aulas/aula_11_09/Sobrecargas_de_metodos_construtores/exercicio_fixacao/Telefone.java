package aula_11_09.Sobrecargas_de_metodos_construtores.exercicios_fixacao.exercicios1;

public class Telefone {

    // Atributos da classe
    private int codigoPais = 55;      // valor padrão
    private int ddd = 16;             // valor padrão
    private String numeroTelefone;

    // Construtor que recebe todos os parâmetros
    public Telefone(int codigoPais, int ddd, String numeroTelefone) {
        // Validação do código do país
        if (codigoPais <= 0) {
            throw new IllegalArgumentException("Código do país deve ser maior que zero.");
        }
        // Validação do DDD
        if (ddd <= 0) {
            throw new IllegalArgumentException("DDD deve ser maior que zero.");
        }
        // Validação do número do telefone
        if (numeroTelefone == null || numeroTelefone.trim().isEmpty() || !numeroTelefone.matches("\\d+")) {
            throw new IllegalArgumentException("Número de telefone inválido. Deve conter apenas dígitos e não estar vazio.");
        }

        // Atribuição após validação
        this.codigoPais = codigoPais;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    // Construtor que recebe DDD e número (usa código do país padrão 55)
    public Telefone(int ddd, String numeroTelefone) {
        this(55, ddd, numeroTelefone); // chama o construtor completo
    }

    // Construtor que recebe apenas número (usa DDD padrão 16 e país padrão 55)
    public Telefone(String numeroTelefone) {
        this(55, 16, numeroTelefone); // chama o construtor completo
    }

    // Getters
    public int getCodigoPais() {
        return codigoPais;
    }

    public int getDdd() {
        return ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String numeroFormatado() {
        return "+" + this.codigoPais + " (" + this.ddd + ") " + this.numeroTelefone;

    }


}
