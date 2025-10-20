package ClassesAbstratas_16_10.exemplo;

public class Autor {
    String nome;
    String cpf;
    String email;

    public Autor() {

    }

    public Autor(String nome) {
        this.nome = nome;
    }

    public Autor(String nome, String cpf, String emailString) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = emailString;
    }

    void mostrarDetalhes() {
        System.out.println("Nome do autor: " + nome + "\nCPF: " + cpf + "\nEmail: " + email);
    }

}
