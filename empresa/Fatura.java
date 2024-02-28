public class Fatura implements Pagavel{
    private double precoItem;
    private int qtdItem;

    public Fatura(double precoItem, int qtdItem) {
        this.precoItem = precoItem;
        this.qtdItem = qtdItem;
    }

    public double obterPagamento(){
        return precoItem * qtdItem;
    }
}
