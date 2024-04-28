public abstract class Empregado implements Pagavel{
    private String nome;
    private String CTPS;

    public Empregado(String nome, String CTPS) {
        this.nome = nome;
        this.CTPS = CTPS;
    }

    @Override
    public String toString() {
        return nome + CTPS;
    }
}
