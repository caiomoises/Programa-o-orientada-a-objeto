public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentaSalario(double novoAumento) {
        salario += novoAumento;
    }

    public double ganhoAnual() {
        return this.salario * 13;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nSalario: " + salario;
    }
}
