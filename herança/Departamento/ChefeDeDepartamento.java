public class ChefeDeDepartamento extends Funcionario{
    private String departamento;

    public ChefeDeDepartamento(String nome, String identidade, double salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String toString(){
        return super.toString() + "Departamento: " + departamento + "\n";
    }
}
