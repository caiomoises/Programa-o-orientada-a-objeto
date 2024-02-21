public class Automovel {
    private int ano;
    private String modelo;
    private String cor;

    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double quantoCusta() {
        if (ano < 2000){
            return 20000;
        } else {
            return 40000;
        }
    }
    
}
