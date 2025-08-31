package indroducao_java_21_08.praticando_em_casa;

public class cadastroAlunos {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "André Silva";
        aluno.idade = 20;
        aluno.curso = "Sistemas para Internet";
        aluno.media = 8.5;


        System.out.println("=== Detalhes do Aluno ===");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Média: " + aluno.media);
    }
}
