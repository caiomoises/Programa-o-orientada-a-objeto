public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(4, 5);

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.desce();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.desce();
        elevador.desce();
        elevador.sai();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.sai();
    }
}
