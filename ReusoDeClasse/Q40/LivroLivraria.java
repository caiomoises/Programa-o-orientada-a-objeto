public class LivroLivraria extends Livro {
    private int quantDisponivel;
    private double preco;

    public LivroLivraria(String titulo, String autor, String editora, String ano, int quantDisponivel, double preco) {
        super(titulo, autor, editora, ano);
        this.quantDisponivel = quantDisponivel;
        this.preco = preco;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() 
        + "\nQuantidade disponivel: " + quantDisponivel
        + "\nPreço: " + preco;
    }
}
