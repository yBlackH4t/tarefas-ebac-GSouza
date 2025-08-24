package br.com.gsouza.pacote1;

public class Classe2 {

    private String testePrivado;

    protected String testeProtected;

    public String testePublic;

    String testeDefault;

    public static void main(String[] args) {
        Classe1 classe1 = new Classe1();
        classe1.getTestePrivado();
    }

}
