public class DemoContador {
    public static void main(String[] args) {
        Contador contador = new Contador(0);

        contador.incrementa();
        contador.incrementa();
        contador.incrementa();

        System.out.println("Contador esta em:" + contador.imprime());
        contador.zerar();
        System.out.println("Contador esta em:" + contador.imprime());
        
    }
}
