public class ContaBancaria {
    private String nome;
    private double saldo;
    private boolean ehEspecial;

    ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0.0;
        this.ehEspecial = false;
    }

    ContaBancaria(String nome, double saldo, boolean ehEspecial){
        this.nome = nome;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
    }
    public String toString(){
        return "[Correntista: " + nome + ", Saldo: " + saldo + ", ehEspecial: " +(ehEspecial?"sim":"não") + "]";
    }
}
