public class DemoFunc {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Caio Moisés", 2000);
        Tecnico tecnico = new Tecnico("João", 2500, 12345, 500);
        tecnico.aumentaSalario(500);
        Administrativo administrativo = new Administrativo("Maria", 3000, 12346, true, 1000);

        System.out.println(funcionario);
        System.out.println();
        System.out.println(tecnico);
        System.out.println();
        System.out.println(administrativo);
    }
}
