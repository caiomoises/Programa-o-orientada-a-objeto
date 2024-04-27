public class Equipamento {
    private String monitor;
    private String teclado;
    private String mouse;

    public Equipamento(String monitor, String teclado, String mouse) {
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "\nMonitor: " + monitor
        + "\nTeclado: " + teclado
        + "\nMouse: " + mouse;
    }

}
