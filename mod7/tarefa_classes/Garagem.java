public class Garagem {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW", "X6", 2025, "Azul Celeste");

        meuCarro.exibirInformacoes();

        meuCarro.ligar();
        meuCarro.acelerar(60);
        meuCarro.frear(25);

        meuCarro.exibirInformacoes();

        meuCarro.desligar(); // Vai avisar que não pode, pois o carro está em movimento
        meuCarro.frear(35); // Velocidade será 0

        meuCarro.desligar();

        meuCarro.exibirInformacoes();

        System.out.println("O meu carro é: " + meuCarro.getMarca() + " " + meuCarro.getModelo() + " e está parado na garagem!");

    }
}
