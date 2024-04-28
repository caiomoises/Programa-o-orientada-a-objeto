public class FuncionarioQ {
    private int id;
    private String nome;
    private double salario;
    private int hora;

    public FuncionarioQ(String nome) {
        this.nome = nome;
        this.salario = 35;
        this.hora = 40;
        this.id = 123;
    }

    public FuncionarioQ(String nome, double salario, int horas, int id) {
        this.nome = nome;
        this.salario = salario;
        this.hora = horas;
        this.id = 123;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario * hora;
    }

    public int getHoras() {
        return hora;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoras(int horas) {
        this.hora = horas;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "\nid: " + id +
                "\nNome: '" + nome +
                "\nSalario: " + salario +
                "\nHoras: " + hora;
    }
}
