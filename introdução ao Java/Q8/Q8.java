package Q8;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        float produto;

        
        do {
            System.out.print("\n\n");
            System.out.println("|     CODIGO    ||          SETOR:         |");
            System.out.println("|      111      ||    Cama, mesa, banho    |");
            System.out.println("|      222      ||         Eletros         |");
            System.out.println("|      000      ||          SAIR           |");
            System.out.print("\nCodigo: ");
            codigo = input.nextInt();

            switch (codigo) {
                case 111:
                    System.out.print("SETOR CAMA, MESA E BANHO!\n");
                    System.out.print("Qual o valor da peça? ");
                    produto = input.nextFloat();
                    if(produto <= 50){
                        produto = produto - ((produto * 10)/100);
                        System.out.println("Valor final do produto com 10% de desconto: R$" + produto);
                        break;
                    } else if(produto > 50 && produto <= 100){
                        produto = produto - ((produto * 20)/100);
                        System.out.println("Valor final do produto com 20% de desconto: R$" + produto);
                        break;
                    } else{
                        produto = produto - ((produto * 40)/100);
                        System.out.println("Valor final do produto com 40% de desconto: R$" + produto);
                        break;
                    }
    
                case 222:
                    System.out.print("SETOR ELETROS!\n");
                    System.out.print("Qual o valor da peça? ");
                    produto = input.nextFloat();
                    if(produto >= 500){
                        produto = produto - ((produto * 10)/100);
                        System.out.println("Valor final do produto com 10% de desconto: R$" + produto);
                        break;
                    }
                    System.out.println("Valor final do produto = R$" + produto);
                    break;
                case 000:
                    System.out.println("obrigado por usar este programa! ");
                    break;

                default:
                    System.out.print("Setor invalido.\n\nTente novamente!");
                    
            }
        } while (codigo != 000);

        input.close();
    }
    
}
