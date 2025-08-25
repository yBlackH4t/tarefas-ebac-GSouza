package tarefa_wrappers;

import java.util.Scanner;

public class TarefaWrappers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Defina a pontuação máxima possível no jogo: ");
        int maxScore = scanner.nextInt();
        System.out.println("Insira sua pontuação feita: ");
        int userScore = scanner.nextInt();

        scanner.close();

        //Convertemos o numero primitivo para wrapper
        Integer wrapperMaxScore = Integer.valueOf(maxScore);
        Integer wrapperUserScore = Integer.valueOf(userScore);

        // Convertemos um dos valores para 'float'
        float porcentagem = ((float) wrapperUserScore / wrapperMaxScore * 100);

        System.out.println("A porcentagem do usuário é: " + porcentagem + "%");

    }
}
