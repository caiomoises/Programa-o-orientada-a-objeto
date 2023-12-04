package Q5;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        int valor, c, d, u;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um vallor de três digitos: ");
        
        valor = input.nextInt();

        c = valor/100;
        valor = valor - (c*100);
        d = valor/10;
        u = valor - (d*10);

        System.out.println("O valor no modelo CDU é " + c + d + u + ", no modelo UCD é "+ u + c + d);

        input.close();
    }
    
}
