public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;

    void inicializaRegistroAcademico(String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }
}
