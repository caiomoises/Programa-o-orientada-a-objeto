import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double grausCentigrados;

        System.out.print("Insira um valor em graus centigrados: ");
        grausCentigrados = input.nextDouble();

        double fahrenheit = (grausCentigrados * 9/5) + 32;
        
        System.out.println("Celsius: " + grausCentigrados
                        + "\nFahrenheit: " + fahrenheit
                        );
        input.close();
    }
}