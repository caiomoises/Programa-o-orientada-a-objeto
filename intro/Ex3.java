import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double anguloGraus;

        System.out.print("Insira o valor do angulo em graus: ");
        anguloGraus = input.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double cossecante = (seno != 0) ? 1 / seno : Double.POSITIVE_INFINITY;
        double secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY;
        double cotangente = (tangente != 0) ? 1 / tangente : Double.POSITIVE_INFINITY;

        System.out.println("Angulo em graus: " + anguloGraus
                        + "\nAngulo em radianos: " + anguloRadianos
                        + "\nSeno: " + seno
                        + "\nCosseno: " + cosseno
                        + "\nTangente: " + tangente
                        + "\nCossecante: " + cossecante
                        + "\nSecante: " + secante
                        + "\nCotangente: " + cotangente
                        );

        input.close();
    }
}