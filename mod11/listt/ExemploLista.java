package listt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {

        List<Double> notas = new LinkedList<>();
        notas.add(10.0);
        notas.add(5.6);
        notas.add(2.7);
        notas.add(8.1);
        Collections.sort(notas);
        System.out.println(notas);
    }
}
