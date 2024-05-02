import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int minutos, horasTotais, horas, dias, resto;

        System.out.print("Insira um valor em minutos: ");
        minutos = input.nextInt();

        horasTotais = minutos/60;
        dias = horasTotais/24;
        horas = horasTotais%24;
        resto = minutos%60;

        System.out.println(minutos + " minutos = " + dias + " dias, " + horas + " horas " + resto + " minutos.");
        input.close();
    }
}
