import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, media = 0;

        System.out.print("n1: ");
        n1 = input.nextDouble();
        System.out.print("n2: ");
        n2 = input.nextDouble();
        System.out.print("n3: ");
        n3 = input.nextDouble();

        media = media(n1, n2, n3);

        System.out.println("Media = " + media);

        input.close();
    }

    public static double media(double num1, double num2, double num3){
        double m;
        m = (num1 + num2 + num3) / 3;
        return m;
    }
    
}
