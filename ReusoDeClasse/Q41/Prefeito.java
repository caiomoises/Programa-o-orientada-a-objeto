public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, int idade, String partidoPolitico, String cidade) {
        super(nome, idade, partidoPolitico);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\nDados para o prefeito da cidade " + cidade
        + super.toString();
    }
}
