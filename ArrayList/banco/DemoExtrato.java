import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        int op;
        double valor;
        Scanner sc = new Scanner(System.in);
        Extrato extrato = new Extrato();

        do{
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Visualizar Extrato");
            System.out.println("4 - Encerrar");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Opção escolhida: Deposito");
                    System.out.println("Valor do deposito: ");
                    valor = sc.nextDouble();
                    extrato.deposito(valor);
                    break;
                case 2:
                    System.out.println("Opção escolhida: Saque");
                    System.out.println("Valor do saque: ");
                    valor = sc.nextDouble();
                    extrato.saque(valor);
                    break;
                case 3:
                    System.out.println("Opção escolhida: Visualizar Extrato");
                    extrato.visualizar();
                    break;
                case 4:
                    System.out.println("Opção escolhida: Encerrar");
                    break;
            
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while(op != 4);  
        sc.close();
    }
}
