package tarefa_controledefluxo;

import java.util.Scanner;

public class ComputandoNotas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(4);
        aluno.coletarEntradas();
        aluno.imprimirMedia();

    }
}
