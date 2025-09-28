package exercicios.exercicio1;

public class Veterinario {

    // Método que recebe qualquer Animal e chama emitirSom
    public void examinar(Animal animal) {
        System.out.print(animal.nome + " diz: ");
        animal.emitirSom();
    }

    // Main para testar
    public static void main(String[] args) {
        Veterinario vet = new Veterinario();

        Cachorro cachorro = new Cachorro("Rex", 3);
        Cavalo cavalo = new Cavalo("Relâmpago", 5);
        Preguica preguica = new Preguica("Sid", 2);

        vet.examinar(cachorro);  // Rex diz: Latir
        vet.examinar(cavalo);    // Relâmpago diz: Relinchar
        vet.examinar(preguica);  // Sid diz: Grunhir
    }
}
