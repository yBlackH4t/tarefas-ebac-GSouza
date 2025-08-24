public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    /**
     * Liga o motor do carro se ele estiver desligado.
     */
    public void ligar(){
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O " + this.modelo + " agora está ligado");
        } else {
            System.out.println("O " + this.modelo + " ja está ligado!");
        }
    }

    /**
     * Desliga o motor do carro se ele estiver ligado e parado.
     */
    public void desligar(){
        if (this.ligado){
            if (this.velocidadeAtual == 0 ){
                this.ligado = false;
                System.out.println("O " + this.modelo + " foi desligado!");
            } else {
                System.out.println("Não é possivel desliagr o carro em movimento!!!");
            }
        } else {
            System.out.println("O " + this.modelo + " ja está desligado!");
        }
    }

    /**
     * Aumenta a velocidade do carro se ele estiver ligado.
     * @param valor O valor em km/h para aumentar a velocidade.
     */
    public void acelerar(int valor) {
        if (this.ligado) {
            this.velocidadeAtual += valor;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("Você precisa ligar o carro primeiro!");
        }
    }

    /**
     * Reduz a velocidade do carro. A velocidade não se torna negativa.
     * @param valor O valor em km/h para diminuir a velocidade.
     */
    public void frear(int valor) {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= valor;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0; // Garante que a velocidade não seja negativa
            }
            System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    /**
     * Exibe um resumo das informações atuais do carro.
     */
    public void exibirInformacoes() {
        String estadoMotor = this.ligado ? "Ligado" : "Desligado";
        System.out.println("\n--- Informações do Carro ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Estado do Motor: " + estadoMotor);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
        System.out.println("--------------------------\n");
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}
