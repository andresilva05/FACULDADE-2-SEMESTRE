package exercicios.exercicios4;

// Classe Editora representa uma editora com nome, website e contador de editoras criadas
public class Editora {

    String nome;              // Nome da editora
    String webSite;           // Website da editora
    static int contadorEditora = 0; // Contador de editoras criadas (estático para ser global)

    // Construtor da editora
    public Editora(String nome, String webSite) {
        this.nome = nome;         // Atribui o nome
        this.webSite = webSite;   // Atribui o website
        contadorEditora++;        // Incrementa o contador estático sempre que uma nova editora é criada
    }

    // Método que originalmente incrementava contador (não necessário se já incrementa no construtor)
    public void incrementarPublicacoes() {
        contadorEditora++;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Getter para o website
    public String getWebSite() {
        return webSite;
    }

    // Getter estático para obter o total de editoras criadas
    public static int getContadorEditora() {
        return contadorEditora;
    }
}
