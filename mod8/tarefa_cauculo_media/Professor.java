package tarefa_cauculo_media;

public class Professor {
    public static void main(String[] args) {

        NotasAlunos aluno1 = new NotasAlunos(5.5f, 7.5f, 8.9, 4.3);

        System.out.println("A média do aluno é: " + aluno1.media());

    }

}
