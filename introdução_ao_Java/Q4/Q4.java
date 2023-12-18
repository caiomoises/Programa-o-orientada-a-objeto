import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Graus Celsius: ");

        celsius = input.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        input.close();
    }
}
