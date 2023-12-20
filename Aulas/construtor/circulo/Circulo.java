public class Circulo {
    private double raio;
    public final static double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double perimetro(){
        return 2*pi*raio;
    }
    
}
