package colecoes_parte2;

public class Humano {
    private String nome;
    private char sexo;

    public Humano(String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return nome + " | " + sexo;
    }

    public String getNome() {
        return nome;
    }


    public char getSexo() {
        return sexo;
    }

}
