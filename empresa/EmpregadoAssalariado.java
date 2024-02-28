public class EmpregadoAssalariado extends Empregado{
    private double salario;

    public EmpregadoAssalariado(String nome, String CTPS, double salario) {
        super(nome, CTPS);
        this.salario = salario;
    }

    public double obterPagamento(){
        return salario;
    }
}
