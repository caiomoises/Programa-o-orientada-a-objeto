package Q1;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        float lado;
        float area;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado:");
        lado = input.nextFloat();
        input.close();

        area = lado*lado;

        System.out.println("A área do quadrado é: "+ area +" metros quadrados");

        

    }
}