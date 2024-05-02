import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int soma = 0;
        float media;
        int valor;

        Scanner input = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.print("Insira o " + (i+1) + "º valor: ");
            valor = input.nextInt();
            soma += valor;
        }
        media = soma/3.0f;
        System.out.println("A soma dos valores é: " + soma
        + "\nA media destes valores é: " + media);
        input.close();
    }
}
