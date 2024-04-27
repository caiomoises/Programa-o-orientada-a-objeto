import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> entradaEmAgendas;

    public Agenda() {
        entradaEmAgendas = new ArrayList<>();
    }

    public void adicionaCompromisso(EntradaEmAgenda entradaEmAgenda) {
        entradaEmAgendas.add(entradaEmAgenda);
        System.out.println("compromisso adicionado com sucesso!");
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda item : entradaEmAgendas) {
            if (item.ehNoDia(dia, mes, ano)) {
                System.out.println(item.toString());
            }
        }
    }
}