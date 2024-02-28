public class DemoControle {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Carro carro = new Carro(4, 4, "okha0815");
        Aviao aviao = new Aviao(100, "kjgf1545", "PT-123");
        Barco barco = new Barco(10, 100, "lkhs1512");
        
        System.out.println("\tCarro: " + carro + "\n");
        System.out.println("\tAvião: " + aviao + "\n");
        System.out.println("\tBarco: " + barco + "\n");
        
        controle.controlar(carro);
        controle.controlar(aviao);
        controle.controlar(barco);
    }
}
