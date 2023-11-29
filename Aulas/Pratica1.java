import java.util.Scanner;

public class Pratica1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, dist;

        System.out.print("Informe o valor de X1: ");
        x1 = input.nextDouble();
        System.out.print("Informe o valor de Y1: ");
        y1 = input.nextDouble();
        System.out.print("Informe o valor de X2: ");
        x2 = input.nextDouble();
        System.out.print("Informe o valor de Y2: ");
        y2 = input.nextDouble();

        // raiz((x2-x1)^2 + (y2-y1)^2);

        dist = Math.sqrt(Math.pow((x2-x1), 2) + (Math.pow(y2-y1, 2)));
        System.out.println("A distância entre os dois pontos é "+ dist);

        input.close();
    }
}
