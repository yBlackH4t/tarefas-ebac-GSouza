package colecoes_parte2;

import java.util.*;

public class Cadastro {
    private List<Humano> pessoasList  = new ArrayList<>();

    public void coletarEntrada() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu nome, sexo, (ou 'sair' para encerrar):");
            String entrada = scanner.nextLine();

            if (entrada.trim().equalsIgnoreCase("sair")){
                System.out.println("Saindo...");
                break;
            }
            armazenaEntrada(entrada);
        }
        scanner.close();
    }

    public void armazenaEntrada(String entrada){
        String [] partes = entrada.split(",");
        if (partes.length >= 2){
            String nome = partes[0].trim();
            char sexo = partes[1].trim().charAt(0);
            pessoasList.add(new Humano(nome, sexo));
        } else {
            System.out.println("Entrada inválida!");
        }

    }

    public Map<Character, List<Humano>> separarPorGenero() {
        List<Humano> masculinos = new ArrayList<>();
        List<Humano> femininos = new ArrayList<>();

        for (Humano humano : this.pessoasList) {
            if (Character.toUpperCase(humano.getSexo()) == 'M') {
                masculinos.add(humano);
            } else {
                femininos.add(humano);
            }
        }
        Map<Character, List<Humano>> generosSeparados = new HashMap<>();
        generosSeparados.put('M', masculinos);
        generosSeparados.put('F', femininos);

        return generosSeparados;
    }

}
