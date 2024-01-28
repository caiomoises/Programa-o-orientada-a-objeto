public class DemoAlunos {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos(2022010403, "Caio Moisés", 5, 5, 5);
        // Alunos aluno2 = new Alunos(2022011232, "José Mateus", 5, 4, 6);

        double mediaParcial = aluno1.media();
        double mediaFinal = aluno1.provaFinal(5);

        if(mediaParcial >= 7) {
            System.out.println("Aluno: " + aluno1.nome + 
            "\nMatricula: " + aluno1.matricula +
            "\nMédia: " + mediaParcial +
            "\nSituação: Aprovado!");
        }
        else if(mediaParcial < 3) {
            System.out.println("Aluno: " + aluno1.nome + 
            "\nMatricula: " + aluno1.matricula +
            "\nMédia: " + mediaParcial +
            "\nSituação: Reprovado!");
        }
        else{
            if(mediaFinal >= 5){
                System.out.println("Aluno: " + aluno1.nome + 
                "\nMatricula: " + aluno1.matricula +
                "\nMédia: " + mediaFinal +
                "\nSituação: Aprovado na recuperação!");
            }
            else{
                System.out.println("Aluno: " + aluno1.nome + 
                "\nMatricula: " + aluno1.matricula +
                "\nMédia: " + mediaFinal +
                "\nSituação: Reprovado na recuperação!");
            }
        }
    }
}
