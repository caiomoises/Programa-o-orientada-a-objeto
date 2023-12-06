package Aulas.lacosDeRepeticao;

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        int n, cont, fat;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira n: ");
        n = input.nextInt();
        input.close();
        for(cont=0; cont <=n; cont++){
            fat=1;
            for( int i=cont; i>1; i--){
                fat*=i;
            }
            System.out.println("Fatorial de " + cont + " = " + fat);
        }
    }
}
