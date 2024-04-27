public class DemoEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Mancer Valak 240z", "Redragon castor", "Redragon Pegasus");
        Computador computador = new Computador("Mancer Valak 240z", "Redragon castor", "Redragon Pegasus", "16gb DDR5", "526gb M2", "ATX");

        System.out.println(equipamento);
        System.out.println();
        System.out.println(computador);
    }
}
