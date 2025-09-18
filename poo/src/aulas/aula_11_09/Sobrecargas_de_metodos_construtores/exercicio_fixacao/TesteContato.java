package aula_11_09.Sobrecargas_de_metodos_construtores.exercicios_fixacao.exercicios1;

public class TesteContato {

    public static void main(String[] args) {

        // Testa o construtor 1: Nome + Sobrenome + Número (String)
        Contato contato = new Contato("André", "Silva", "998467362");

        // Testa o construtor 2: Nome + Sobrenome + DDD + Número
        Contato contato2 = new Contato("André", "Silva", 14, "998467362");

        // Testa o construtor 3: Nome + Sobrenome + Código do País + DDD + Número
        Contato contato3 = new Contato("André", "Silva", 15, 14, "998467362");

        // Cria um objeto Telefone para passar ao construtor 4
        Telefone telefone = new Telefone(55, 14, "996271030");

        // Testa o construtor 4: Nome + Sobrenome + Telefone (objeto)
        Contato contato4 = new Contato("Wilson", "Oliveira", telefone);

        // Imprime os dados de cada contato e o número formatado
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
