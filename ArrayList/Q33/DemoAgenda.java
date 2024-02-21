public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        EntradaEmAgenda entrada = new EntradaEmAgenda("3:15", 10, 2, 2024, "Aula");
        EntradaEmAgenda aniversario = new EntradaEmAgenda("3:15", 18, 1, 2025, "aniversario");
        agenda.adicionaCompromisso(entrada);
        agenda.adicionaCompromisso(aniversario);
        agenda.listaDia(18, 1, 2024);
    }
}
