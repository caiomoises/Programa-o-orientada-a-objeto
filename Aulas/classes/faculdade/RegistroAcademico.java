public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public void inicializaRegistroAcademico(String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    public double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }
}
