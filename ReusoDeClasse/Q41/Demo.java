public class Demo {
    public static void main(String[] args) {
        Politico politico = new Politico("Bolsonaro", 60, "PSL");
        Prefeito prefeito = new Prefeito("Aline", 35, "PSL", "Alexandria");
        Governador governador = new Governador("Stiverson", 40, "PSL", "RN");

        System.out.println(politico);
        System.out.println();
        System.out.println(prefeito);
        System.out.println();
        System.out.println(governador);
    }
}
