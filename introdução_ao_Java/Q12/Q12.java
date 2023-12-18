import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;

        System.out.println("Qual o dia: ");
        dia = input.nextInt();

        if(dia==1 || dia==8 || dia==15 || dia==22){
            System.out.println("O dia "+ dia + " será em um domingo");
        }else if(dia==2 || dia==9 || dia==16 || dia==23){
            System.out.println("O dia "+ dia + " será em uma segunda-feira");
        }else if(dia==3 || dia==10 || dia==17 || dia==24){
            System.out.println("O dia "+ dia + " será em uma terça-feira");
        }else if(dia==4 || dia==11 || dia==18 || dia==25){
            System.out.println("O dia "+ dia + " será em uma quarta-feira");
        }else if(dia==5 || dia==12 || dia==19 || dia==26){
            System.out.println("O dia "+ dia + " será em uma quinta-feira");
        }else if(dia==6 || dia==13 || dia==20 || dia==27){
            System.out.println("O dia "+ dia + " será em uma sexta-feira");
        }else{
            System.out.println("O dia "+ dia + " será em um sabado");
        }

        input.close();
    }
}
