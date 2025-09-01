package tarefa_colecoes;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Policial policial = new Policial();

        policial.coletarEntradas();
        policial.ordenarEntrada();

        Map<Character, List<Pessoa>> grupos = policial.separarPorGenero();

        List<Pessoa> homens = grupos.get('M');
        List<Pessoa> mulheres = grupos.get('F');

        System.out.println("\n--- Pessoas do Sexo Masculino ---");
        if (homens.isEmpty()) {
            System.out.println("Nenhuma pessoa do sexo masculino encontrada.");
        } else {
            homens.forEach(System.out::println);
        }
        System.out.println("\n--- Pessoas do Sexo Feminino ---");
        if (mulheres.isEmpty()) {
            System.out.println("Nenhuma pessoa do sexo feminino encontrada.");
        } else {
            mulheres.forEach(System.out::println);
        }

        System.out.println("\nPrograma finalizado.");
    }


}


