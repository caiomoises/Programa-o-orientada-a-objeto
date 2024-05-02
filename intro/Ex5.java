import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, centena, dezena, unidade;
        
        do{
            System.out.print("Insira um valor de 3 digitos no maximo: ");
            valor = input.nextInt();
        }while(valor > 999 || valor < 100);

        centena = valor/100;
        dezena = (valor - (100*centena)) / 10;
        unidade = valor - (dezena*10 + centena*100);

        System.out.println("\nValor inicial: " + valor
                        + "\nCentena: " + centena
                        + "\nDezena: " + dezena
                        + "\nUnidade: " + unidade
                        + "\nValor invertido: " + unidade + centena + dezena);
        input.close();
    }
}