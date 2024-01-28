public class Alunos {
    public int matricula;
    public String nome;
    public double P1;
    public double P2;
    public double T;

    public Alunos(int matricula, String nome, double P1, double P2, double T) {
        this. matricula = matricula;
        this.nome = nome;
        this.P1 = P1;
        this.P2 = P2;
        this.T = T;
    }

    public double media() {
        return ((P1*2.5 + P2*2.5 + T*2)/7);
    }

    public double provaFinal(double exameFinal) {
        double media = this.media();
        if (media < 3 || media >= 7) {
            return 0;
        }
        return ((media*6 + exameFinal*4)/10);
    }
}
