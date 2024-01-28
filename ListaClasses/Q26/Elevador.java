public class Elevador {
    public int numeroAndarAtual;
    public int numeroAndaresTotal;
    public int capacidadeMaxima;
    public int pessoasPresentes;

    public Elevador(int capacidadeMaxima, int numeroAndaresTotal) {
        numeroAndarAtual = 0;
        pessoasPresentes = 0;
        this.capacidadeMaxima = capacidadeMaxima;
        this.numeroAndaresTotal = numeroAndaresTotal;
    }

    public void entra(){
        if(pessoasPresentes < capacidadeMaxima) {
            pessoasPresentes++;
            funcionamento();
        }
        else{
            System.out.println("Limite maximo de pessoas atingido!");
        }
    }

    public void sai() {
        if(pessoasPresentes != 0){
            pessoasPresentes--;
            funcionamento();
        }
        else{
            System.out.println("Não há ninguem para descer!");
        }
    }

    public void sobe() {
        if(numeroAndarAtual < numeroAndaresTotal){
            numeroAndarAtual++;
            funcionamento();
        }
        else{
            System.out.println("O Elevador ja esta no ultimo andar");
        }
    }

    public void desce() {
        if(numeroAndarAtual > 0){
            numeroAndarAtual--;
            funcionamento();
        }
        else{
            System.out.println("O elevador ja esta no terreo!");
        }
    }

    public void funcionamento(){
        System.out.println("Pessoas presentes: " + pessoasPresentes +
        "\nNúmero maximo: " + capacidadeMaxima +
        "\nAndar atual: " + numeroAndarAtual);
    }
}
