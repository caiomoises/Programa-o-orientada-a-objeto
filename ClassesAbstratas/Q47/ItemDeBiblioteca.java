public interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 14;
    boolean estaEmprestado();
    void empresta();
    void devolve();
    String localizacao();
    String descricao();
}