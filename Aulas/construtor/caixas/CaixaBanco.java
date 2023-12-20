public class CaixaBanco {
    private int numeroCaixa;
    private static int clientesAtendidos=0;

    CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
        System.out.println("Caixa " + numeroCaixa + " Inicializado");
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa " + numeroCaixa + " Atendeu o cliente " + (clientesAtendidos+1));
        clientesAtendidos++;
    }
}
