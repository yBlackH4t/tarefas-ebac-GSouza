package tarefa_colecoes;

import java.util.*;

public class Policial {

    private List<Pessoa> enquadro = new ArrayList<>();

    public void coletarEntradas() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu nome; sexo; idade (ou 'sair' para encerrar):");
            String entrada = scanner.nextLine();

            if (entrada.trim().equalsIgnoreCase("sair")) {
                System.out.println("Encerrando...");
                break;
            }
            armazenarEntrada(entrada);
        }
        scanner.close();
    }

    public void armazenarEntrada(String entrada) {
        String[] partes = entrada.split(";");
        if (partes.length >= 3) {
            String nome = partes[0].trim();
            char sexo = partes[1].trim().charAt(0);
            int idade = Integer.parseInt(partes[2].trim());
            enquadro.add(new Pessoa(nome, sexo, idade));
        } else {
            System.out.println("Entrada inválida!");
        }
    }

    public void ordenarEntrada() {
        Collections.sort(enquadro, Comparator.comparing(pessoa -> pessoa.getNome()));
    }

    public Map<Character, List<Pessoa>> separarPorGenero() {
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();

        for (Pessoa pessoa : this.enquadro) {
            if (Character.toUpperCase(pessoa.getSexo()) == 'M') {
                masculinos.add(pessoa);
            } else {
                femininos.add(pessoa);
            }
        }
        Map<Character, List<Pessoa>> generosSeparados = new HashMap<>();
        generosSeparados.put('M', masculinos);
        generosSeparados.put('F', femininos);

        return generosSeparados;
    }

//        Se o sexo da pessoa for M
//            Adiciona dentro de uma lista M
//        Senao
//            Adicona dentro de uma lista F


}
