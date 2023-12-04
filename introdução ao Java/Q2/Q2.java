package Q2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        float soma=0, n;
        int index;

        Scanner input = new Scanner(System.in);
        
        for(index=1; index <= 3; index++){
            System.out.print("Digite a nota "+index+": ");
            n = input.nextFloat();
            soma += n;
        }
        
        input.close();
        
        float media = soma/3;
        
        if (media >= 7){
            System.out.print("APROVADO\n");
            System.out.print("A média das notas é "+media);
        }
        else if(media < 7 && media >= 3.5){
            System.out.print("Você está na quarta prova\n");
            System.out.print("A média das notas é "+media);
        }
        else if(media < 3.5){
            System.out.print("REPROVADO\n");
            System.out.print("A média das notas é "+media);
        }
    }
}