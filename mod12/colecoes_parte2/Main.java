package colecoes_parte2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        cadastro.coletarEntrada();

        Map<Character, List<Humano>> grupos = cadastro.separarPorGenero();

        List<Humano> homens = grupos.get('M');
        List<Humano> mulheres = grupos.get('F');

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

