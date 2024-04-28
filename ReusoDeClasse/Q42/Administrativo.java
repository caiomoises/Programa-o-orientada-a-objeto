public class Administrativo extends Assistente{
    private boolean turno;
    private int adicional;

    public Administrativo(String nome, double salario, int id, boolean turno, int adicional) {
        super(nome, salario, id);
        this.turno = turno;
        this.adicional = adicional;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + adicional;
    }

    @Override
    public String toString() {
        return super.toString() + ", adicional para o administrativo: " + adicional;
    }
}
