public class Fatura {
    public int numeroIdentificacao;
    public String descricao;
    public int quantidade;
    public double preco;

    public Fatura(int numeroIdentificacao, String descricao, int quantidade, double preco) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;

        if(quantidade < 0){
            this.quantidade = 0;
        }

        if(preco < 0){
            this.preco = 0.0;
        }
    }
    public double calculaTotal(){
        return preco * quantidade;
    }
}
