import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        String saidaFormatada = "";

        System.out.print("Dia: ");
        dia = input.nextInt();
        System.out.print("Mês: ");
        mes = input.nextInt();
        System.out.print("Ano: ");
        ano = input.nextInt();

        saidaFormatada += (dia + " de ");

        if (mes == 1){
            saidaFormatada += "Janeiro";
        } else if (mes == 2){
            saidaFormatada += "Fevereiro";
        } else if (mes == 3){
            saidaFormatada += "Março";
        } else if (mes == 4){
            saidaFormatada += "Abril";
        } else if (mes == 5){
            saidaFormatada += "Maio";
        } else if (mes == 6){
            saidaFormatada += "Junho";
        } else if (mes == 7){
            saidaFormatada += "Julho";
        } else if (mes == 8){
            saidaFormatada += "Agosto";
        } else if (mes == 9){
            saidaFormatada += "Setembro";
        } else if (mes == 10){
            saidaFormatada += "Outubro";
        } else if (mes == 11){
            saidaFormatada += "Novembro";
        } else if (mes == 12){
            saidaFormatada += "Dezembro";
        }

        saidaFormatada += (" de "+ ano);

        System.out.print(saidaFormatada);

        input.close();
    }
}
