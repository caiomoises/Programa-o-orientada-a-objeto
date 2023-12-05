package Q3;

import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        float graus;
        double radianos;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor em Graus: ");

        graus = input.nextFloat();

        radianos = (graus * Math.PI) / 180;

        System.out.println(graus + " Graus = " + radianos + " Radianos");

        input.close();
    }
}
