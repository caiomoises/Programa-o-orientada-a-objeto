public class DemoRH {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Caio Moisés", "201234568");
        Funcionario funcionario = new Funcionario("Pedro", "456789565", 2545.00);
        ChefeDeDepartamento chefe = new ChefeDeDepartamento("Arthur", "45789655632", 10254.00, "Tecnologia da Informação");

        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(chefe);

    }
}
