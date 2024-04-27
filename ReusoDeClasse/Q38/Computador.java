public class Computador extends Equipamento{
    private String memoriaRam;
    private String ssd;
    private String placaMae;

    public Computador(String monitor, String teclado, String mouse, String memoriaRam, String ssd, String placaMae) {
        super(monitor, teclado, mouse);
        this.memoriaRam = memoriaRam;
        this.ssd = ssd;
        this.placaMae = placaMae;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        return "\nMemoria RAM: " + memoriaRam
        + "\nSSD: " + ssd
        + "\nPlaca mãe: " + placaMae
        + super.toString();
    }
}
