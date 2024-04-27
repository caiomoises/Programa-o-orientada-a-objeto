public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(String data, String hora) {
        super(data, hora);
        this.evento = "Herança";
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
    @Override
    public String toString() {
        return super.toString()
        + "h\nEvento: " + evento;
    }
}
