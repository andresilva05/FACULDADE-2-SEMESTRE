package exercicios.exercicio3;

// Subclasse de ArCondicionado
public class ArParede extends ArCondicionado {

    // Atributos específicos do ArParede
    String cor;
    int voltagem;
    boolean controleRemoto;

    // Construtor da subclasse
    // Chama o construtor da superclasse (ArCondicionado) para inicializar os atributos comuns
    public ArParede(int serie, int btu, boolean arQuente, int voltagem, String cor, boolean controleRemoto) {
        super(serie, btu, arQuente);  // atributos da superclasse

        // atributos próprios
        this.cor = cor;
        this.voltagem = voltagem;
        this.controleRemoto = controleRemoto;
    }

    // Sobrescreve mostrarDados para mostrar as informações extras
    @Override
    public void mostrarDados() {
        super.mostrarDados(); // exibe dados comuns (serie, btu, temperatura)

        // mostra os dados específicos do ArParede
        System.out.println("VOLTAGEM: " + voltagem);
        System.out.println("COR: " + cor);

        // exibe se tem controle remoto
        if (controleRemoto) {
            System.out.println("CONTROLE REMOTO: YES");
        } else {
            System.out.println("CONTROLE REMOTO: NO");

        }
    }
}
