public class RegistroAcademico {
    private String nomeDoAluno;
    private String matricula;
    private String curso;

    public RegistroAcademico(String nomeDoAluno, String matricula, String curso) {
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        String res = "";
        res += "Nome do aluno: " + nomeDoAluno + "\n";
        res += "Matricula: " + matricula + "\n";
        res += "Curso: " + curso + "\n";

        return res;

    }

    
}
