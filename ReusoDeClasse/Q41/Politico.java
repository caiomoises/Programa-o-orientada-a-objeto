public class Politico extends PessoaP{
    private String partidoPolitico;

    public Politico(String nome, int idade, String partidoPolitico) {
        super(nome, idade);
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nPartido associado: " + partidoPolitico;
    }
}
