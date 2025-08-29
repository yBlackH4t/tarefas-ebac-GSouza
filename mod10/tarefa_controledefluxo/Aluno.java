package tarefa_controledefluxo;

import java.util.Scanner;

public class Aluno {

    private double[] notas;

    public Aluno(int quantidadeNotas) {
        this.notas = new double[4];
    }

    public void coletarEntradas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira as " + this.notas.length + " notas do aluno:");

        for (int i = 0; i < this.notas.length; i++) {
            System.out.print("Digite as notas " + (i + 1) + ": ");
            this.notas[i] = scanner.nextDouble();
        }

        scanner.close();
    }

    private double calcularSomaDasNotas() {
        double soma = 0.0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma;
    }

    private double calcularMedia() {
        if (this.notas.length == 0) {
            return 0.0;
        }
        double soma = calcularSomaDasNotas();
        return soma / this.notas.length;
    }

    public String verificarSituacao() {
        double media = calcularMedia();

        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Em Recuperação";
        } else {
            return "Reprovado";
        }
    }


    public void imprimirMedia() {
        double media = calcularMedia();
        String situacao = verificarSituacao();

        System.out.println("\n--- Boletim Final ---");
        System.out.printf("Média final do aluno: %.2f\n", media);
        System.out.println("Situação: " + situacao);
    }
}

