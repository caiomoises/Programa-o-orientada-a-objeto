
public class FaturaF {
    public int id;
    public String descricao;
    public int quant;
    public double preco;

    public FaturaF(int id, String descricao, int quant, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.quant = quant;
        this.preco = preco;

        if (quant <= 0) {
            this.quant = 0;
        }
        if (preco <= 0) {
            this.preco = 0.0;
        }
    }
    public double calculaFatura() {
        return preco * quant;
    }
}
