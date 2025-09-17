package ClasseObjetoMetodo_java_04_09.exercicio;

public class Autor {
    private String nome;
    private String cpf;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    void mostrarAutor() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(email);
    }
}