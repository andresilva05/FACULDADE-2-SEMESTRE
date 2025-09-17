package aula_11_09.Sobrecargas_de_metodos_construtores.exercicios_fixacao.exercicios1;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato("André", "Silva", "998467362");

        Contato contato2 = new Contato("André", "Silva", 14, "998467362");

        Contato contato3 = new Contato("André", "Silva", 15, 14, "998467362");

        Telefone telefone = new Telefone(55, 14, "996271030");

        Contato contato4 = new Contato("Wilson", "Oliveira", telefone);

        System.out.println("\n" + contato.getNome() + " " + contato.getSobrenome());
        System.out.println(contato.getTelefone().numeroFormatado());

        System.out.println("\n" + contato2.getNome() + " " + contato2.getSobrenome());
        System.out.println(contato2.getTelefone().numeroFormatado());

        System.out.println("\n" + contato3.getNome() + " " + contato3.getSobrenome());
        System.out.println(contato3.getTelefone().numeroFormatado());

        System.out.println("\n" + contato4.getNome() + " " + contato4.getSobrenome());
        System.out.println(contato4.getTelefone().numeroFormatado());


    }
}
