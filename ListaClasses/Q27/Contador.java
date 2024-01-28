public class Contador {
    private int cont;

    public Contador(int cont) {
        this.cont = cont;
    }

    public void zerar(){
        cont = 0;
        System.out.println("Contador zerado!");
    }

    public void incrementa() {
        cont++;
        System.out.println("Contador foi incrementado!");
    }

    public int imprime() {
        return cont;
    }
}
