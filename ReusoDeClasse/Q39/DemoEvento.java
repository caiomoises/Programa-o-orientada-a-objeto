public class DemoEvento {
    public static void main(String[] args) {
        EventoDelegacao delegacao = new EventoDelegacao("18/01/2025", "00:00");
        EventoHeranca heranca = new EventoHeranca("19/01/2025", "12:45");

        System.out.println(delegacao);
        System.out.println();
        System.out.println(heranca);
    }
}
