package aula_11_09.Sobrecargas_de_metodos_construtores.exercicios_fixacao.exercicios1;

public class Contato {

    private String nome;
    private String sobrenome;
    private Telefone telefone;


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


    public void validarNomeESobrenome(String nome, String sobrenome) {
        if (nome == null || nome.trim().isEmpty() || sobrenome == null || sobrenome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome e sobrenome não pode ser nulo ou vazio");

        }
    }

    // Construtor 1: recebe Nome + Sobrenome + Número (String)
    public Contato(String nome, String sobrenome, String numero) {

        this(nome, sobrenome, 55, 16, numero);

    }


    // Construtor 2: recebe Nome + Sobrenome + DDD + Número
    public Contato(String nome, String sobrenome, int ddd, String numero) {

        this(nome, sobrenome, 55, ddd, numero);

    }

    // Construtor 3: recebe Nome + Sobrenome + Código do País + DDD + Número
    public Contato(String nome, String sobrenome, int codPais, int ddd, String numero) {

        validarNomeESobrenome(nome, sobrenome);

        this.nome = nome;
        this.sobrenome = sobrenome;


        this.telefone = new Telefone(codPais, ddd, numero);

    }

    // Construtor 4: recebe Nome + Sobrenome + Telefone (objeto)
    public Contato(String nome, String sobrenome, Telefone telefone) {
        validarNomeESobrenome(nome, sobrenome);
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone não pode ser nulo");
        }


        this.nome = nome;
        this.sobrenome = sobrenome;

        // Cópia defensiva do Telefone
        this.telefone = new Telefone(
                telefone.getCodigoPais(),
                telefone.getDdd(),
                telefone.getNumeroTelefone()
        );
    }


}
