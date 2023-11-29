import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        float soma=0, n;
        int index;

        Scanner input = new Scanner(System.in);
        
        for(index=1; index <= 3; index++){
            System.out.println("Digite a nota "+index+":");
            n = input.nextFloat();    
            soma += n;
        }
        input.close();

        float media = soma/3;
        
        System.out.println("A média das notas é "+media);
    }
}