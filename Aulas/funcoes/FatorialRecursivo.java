package Aulas.funcoes;

import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fat;

        System.out.print("Informe n: ");
        n = input.nextInt();

        fat = fatorial(n);

        System.out.println("Fatoria de " + n + "! = " + fat);

        input.close();
    }
    public static int fatorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*fatorial(num-1);
        }
    }
}
