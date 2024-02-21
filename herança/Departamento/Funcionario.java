public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, String identidade, double salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String toString(){
        return super.toString() + "Salario: " + salario + "\n";
    }
}
