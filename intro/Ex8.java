import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op;
        int escolha;
        double valor;

        System.out.println("\n\tSETORES"
                        + "\nEletros - 222"
                        + "\nCama, mesa e banho - 111"
                        + "\n\nQual dos setoress deseja acessar: "
                        );
        op = input.nextInt();

        switch (op) {
            case 111:
                System.out.println("\n\tSETOR - CAMA, MESA E BANHO"
                                + "\nCama box - R$ 800,00 - 01"
                                + "\nCama solteiro - R$ 350,00 - 02"
                                + "\nMesa 4 lugares - R$ 645,00 - 03"
                                + "\n\nEscolha o que deeseja: ");
    
                escolha = input.nextInt();
                switch (escolha) {
                    case 01:
                        valor = 800.0;
                        System.out.println("Valor do produto: " + valor
                                        + "\nValor do produto com desconto: " + (valor - (valor*0.1)));
                        break;
                    case 02:
                        valor = 350.0;
                        System.out.println("Valor do produto: " + valor
                                        + "\nValor do produto não aplicado ao desconto");
                        break;
                    case 03:
                        valor = 645.0;
                        System.out.println("Valor do produto: " + valor
                                        + "\nValor do produto com desconto: " + (valor - (valor*0.1)));
                        break;
                    default:
                        break;
                }
                break;
            case 222:
                break;

            default:
                break;
        }

        input.close();
    }
}
