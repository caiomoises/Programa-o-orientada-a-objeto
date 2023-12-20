public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "cs0981", 3, 0.75);
        System.out.println("Mensalidade de Michael: R$" + michael.calculaMensalidade());
        // System.out.println("Matricula: " + michael.matricula);

        RegistroAcademico roberto = new RegistroAcademico();
        //roberto.inicializaRegistroAcademico("roberto", "cs0982", 3, 0.75);
        System.out.println("Mensalidade de roberto: R$" + roberto.calculaMensalidade());
        // System.out.println("Matricula: " + roberto.matricula);
    }
}
