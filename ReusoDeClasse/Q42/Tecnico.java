public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int id, double bonusSalarial) {
        super(nome, salario, id);
        if (bonusSalarial < 0){
            this.bonusSalarial = 0;
        } else{
            this.bonusSalarial = bonusSalarial;
        }
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalarial;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus salarial para o tecnico: " + bonusSalarial;
    }
}
