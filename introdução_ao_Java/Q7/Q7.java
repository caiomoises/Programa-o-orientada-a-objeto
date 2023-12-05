package Q7;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menor = 999999999, valor;
        for(int i=0; i<3; i++){
            System.out.print("Informe um valor: ");

            valor = input.nextInt();
            if(valor < menor){
                menor = valor;
            }
        }

        System.out.println("O menor valor informado é: " + menor);

        input.close();
    }
}
