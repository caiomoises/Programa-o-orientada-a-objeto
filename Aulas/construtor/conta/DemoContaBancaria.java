public class DemoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Caio");
        ContaBancaria c2 = new ContaBancaria("Murilo", 5000, true);
        System.out.println(c1);
        System.out.println(c2);
    }
}
