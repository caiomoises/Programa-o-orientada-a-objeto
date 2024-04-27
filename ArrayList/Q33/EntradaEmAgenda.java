public class EntradaEmAgenda {
    private String hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", assunto="
                + assunto + "]";
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        if (dia == this.dia && mes == this.mes && ano == this.ano) {
            return true;
        }

        return false;
    }
}