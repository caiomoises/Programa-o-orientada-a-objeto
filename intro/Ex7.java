import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int max = 0;
        int min = 999999999;
        for (int i=0; i<3; i++ ){
            System.out.print(i+1 + "º: ");
            numero = input.nextInt();
            if (numero > max){
                max = numero;
            }
            if (numero < min){
                min = numero;
            }
        }
        System.out.println("O maior valor é: " + max
                        + "\nO menor valor é: " + min);
        input.close();
    }
    
}
