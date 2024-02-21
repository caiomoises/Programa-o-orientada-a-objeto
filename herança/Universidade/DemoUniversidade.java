public class DemoUniversidade {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao caio = new RegistroAcademicoPosGraduacao(
        "Caio", 
        "2022010403", 
        "Tecnologia da Informação", 
        "DataScience", 
        "Rosana"
        );
        System.out.println(caio);

        RegistroAcademico paula = new RegistroAcademico(
        "Paula", 
        "2023156325", 
        "Ciencia e tecnologia"
        );
        System.out.println(paula);

        RegistroAcademicoPosGraduacao paulaPos = new RegistroAcademicoPosGraduacao(
            paula, 
            "Doenças", 
            "João Victor"
        );
        System.out.println(paulaPos);
    }
}
