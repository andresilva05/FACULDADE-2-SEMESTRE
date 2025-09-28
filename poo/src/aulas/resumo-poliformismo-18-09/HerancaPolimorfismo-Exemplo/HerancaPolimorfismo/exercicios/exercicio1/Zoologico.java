package exercicios.exercicio1;

public class Zoologico {
    public static void main(String[] args) {

        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Rex", 3);
        jaulas[1] = new Cavalo("Relâmpago", 5);
        jaulas[2] = new Preguica("Sid", 2);


        for (Animal animal : jaulas) {
            animal.emitirSom();

            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            } else if (animal instanceof Preguica) {
                ((Preguica) animal).subirEmArvores();
            }
        }
    }

}
