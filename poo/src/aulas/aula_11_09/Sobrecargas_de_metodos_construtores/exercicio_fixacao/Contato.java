package aula_11_09.Sobrecargas_de_metodos_construtores.exercicios_fixacao.exercicios1;

public class Contato {

    // Atributos da classe Contato
    private String nome;
    private String sobrenome;
    private Telefone telefone;

    // Métodos setters e getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    // Método para validar nome e sobrenome
    public void validarNomeESobrenome(String nome, String sobrenome) {
        if (nome == null || nome.trim().isEmpty() || sobrenome == null || sobrenome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome e sobrenome não pode ser nulo ou vazio");
        }
    }

    // Construtor 1: recebe Nome + Sobrenome + Número (String)
    // Chama o construtor mais completo, usando país e DDD padrão
    public Contato(String nome, String sobrenome, String numero) {
        this(nome, sobrenome, 55, 16, numero);
    }

    // Construtor 2: recebe Nome + Sobrenome + DDD + Número
    // Chama o construtor mais completo, usando país padrão 55
    public Contato(String nome, String sobrenome, int ddd, String numero) {
        this(nome, sobrenome, 55, ddd, numero);
    }

    // Construtor 3: recebe Nome + Sobrenome + Código do País + DDD + Número
    // Construtor mais completo da classe Contato
    public Contato(String nome, String sobrenome, int codPais, int ddd, String numero) {
        validarNomeESobrenome(nome, sobrenome); // Valida nome e sobrenome
        this.nome = nome;
        this.sobrenome = sobrenome;

        // Cria o objeto Telefone com os parâmetros passados
        this.telefone = new Telefone(codPais, ddd, numero);
    }

    // Construtor 4: recebe Nome + Sobrenome + Telefone (objeto)
    // Realiza cópia defensiva para proteger o objeto interno
    public Contato(String nome, String sobrenome, Telefone telefone) {
        validarNomeESobrenome(nome, sobrenome); // Valida nome e sobrenome
        if (telefone == null) { // Valida que o telefone não é nulo
            throw new IllegalArgumentException("Telefone não pode ser nulo");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;

        // Cópia defensiva do Telefone para evitar que alterações externas afetem o objeto interno
        this.telefone = new Telefone(
                telefone.getCodigoPais(),
                telefone.getDdd(),
                telefone.getNumeroTelefone()
        );
    }
}
