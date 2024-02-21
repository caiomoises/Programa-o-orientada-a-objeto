import java.util.ArrayList;

public class Agenda {
    ArrayList<EntradaEmAgenda> entradaEmAgendas;
    Agenda(){
        entradaEmAgendas = new ArrayList<>();
    }

    public void adicionaCompromisso(EntradaEmAgenda compromisso){
        entradaEmAgendas.add(compromisso);
    }

    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda entradaEmAgenda : entradaEmAgendas) {
            if (entradaEmAgenda.eNoDia(dia, mes, ano)){
                System.out.println(entradaEmAgenda.toString());
            }
        }
    }
}
