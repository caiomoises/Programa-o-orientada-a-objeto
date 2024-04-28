public class LivroBiblioteca extends Livro{
    private String secao;
    private int numPaginas;
    private int codLivro;

    public LivroBiblioteca(String titulo, String autor, String editora, String ano, String secao, int numPaginas, int codLivro) {
        super(titulo, autor, editora, ano);
        this.secao = secao;
        this.numPaginas = numPaginas;
        this.codLivro = codLivro;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    @Override
    public String toString() {
        return "\nO livro esta na secao: " + secao
        + "\nPossui o codigo: " + codLivro
        + "\n\n\tInformações sobre o Livro:\nNúmero de paginas: " + numPaginas
        + super.toString();
    }
}
