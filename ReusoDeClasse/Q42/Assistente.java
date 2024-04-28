public class Assistente extends Funcionarios{
    private int id;

    public Assistente(String nome, double salario, int id) {
        super(nome, salario);
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID do funcionario: " + id
        + super.toString();
    }
}
