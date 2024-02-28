public class Carro extends Terrestre{
    private String placa;

    public Carro(int capacidade, int qtdRodas, String placa) {
        super(capacidade, qtdRodas);
        this.placa = placa;
    }

    public Carro(String placa) {
        super(5, 4);
        this.placa = placa;
    }

    public void moverFrente() {
        System.out.println("Carro movendo para frente");
    }

    @Override
    public String toString() {
        return super.toString() + "\nplaca: " + placa;
    }
}
