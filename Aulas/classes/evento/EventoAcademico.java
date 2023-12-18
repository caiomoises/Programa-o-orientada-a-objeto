public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes) {
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    void mostraEvento(){
        System.out.println("Nome do evento: " + nomeDoEvento);
        System.out.println("Local do evento: " + localDoEvento);
        System.out.println("Número de participantes: " + numeroDeParticipantes);
    }
}
