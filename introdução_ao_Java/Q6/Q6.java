import java.util.Scanner;

public class Q6 {
    
    public static void main(String[] args) {
        int dias, horas, minutos;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a quantidade de minutos: ");

        minutos = input.nextInt();

        dias = minutos / (60*24);
        horas = (minutos % (60*24)) / 60;
        minutos = (minutos % (60*24)) % 60;

        System.out.println(dias + " dias, " + horas + " horas, "+ minutos + " e minutos.");

        input.close();
    }
}
