public class Governador extends Politico{
    private String estado;

    public Governador(String nome, int idade, String partidoPolitico, String estado) {
        super(nome, idade, partidoPolitico);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Candidado a governador do estado " + estado
        + super.toString();
    }
}
