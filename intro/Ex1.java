import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        float lado;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o valor do lado do quadrado: ");
        lado = input.nextFloat();

        System.out.println("A área do quadrado é: " + (lado * lado) + " m²");
        input.close();
    }
}
