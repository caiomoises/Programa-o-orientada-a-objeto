package Aulas.lacosDeRepeticao;

import java.util.Scanner;
import java.util.Calendar;

public class Valida_cartao {
    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano, mesAtual, anoAtual;
        boolean cartaoInvalido; 
        
        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.print("Informe seu nome: ");
        nome = input.nextLine();
        System.out.print("Informe o número do cartão: ");
        numero = input.nextLine();
        System.out.print("Informe o codigo: ");
        codigo = input.nextLine();
        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = calendar.get(Calendar.MONTH);

        do{
            System.out.print("Informe o mês: ");
            mes = input.nextInt();
            System.out.print("Informe o ano: ");
            ano = input.nextInt();

            cartaoInvalido = ano<anoAtual || (ano==anoAtual && mes<mesAtual);
            if (cartaoInvalido) System.out.println("Cartão invalido");

        }while(cartaoInvalido);

        System.out.println("Nome: " + nome + "\nnúmero: " + numero + "\nCódigo: " + codigo);
        System.out.println("Cartão validado. prosiga com a compra!");

        // System.out.println("Ano atual: " + anoAtual);
        // System.out.println("Mês atual: " + mesAtual);

        input.close();

    }
    
}
