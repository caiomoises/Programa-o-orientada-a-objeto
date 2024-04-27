public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        EntradaEmAgenda compromisso1 = new EntradaEmAgenda("13:55", 29, 1, 2024, "Avaliação de POO.");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda("18:55", 31, 1, 2024, "Avaliação de PDS.");
        EntradaEmAgenda compromisso3 = new EntradaEmAgenda("08:00", 19, 12, 2024, "Café da manhã");
        EntradaEmAgenda compromisso4 = new EntradaEmAgenda("13:30", 19, 12, 2024, "League of Legends com os amigos");
        EntradaEmAgenda compromisso5 = new EntradaEmAgenda("19:30", 19, 12, 2024, "Jantar");

        agenda.adicionaCompromisso(compromisso1);
        agenda.adicionaCompromisso(compromisso2);
        agenda.adicionaCompromisso(compromisso3);
        agenda.adicionaCompromisso(compromisso4);
        agenda.adicionaCompromisso(compromisso5);

        agenda.listaDia(19, 12, 2024);
    }
}