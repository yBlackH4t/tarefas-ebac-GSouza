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

    public void imprimirMedia() {
        double media = calcularMedia();
        System.out.println("\n--- Resultado ---");
        System.out.println("Calculando a média das notas...");
        System.out.printf("A média final do aluno é: %.2f\n", media);
    }
}

