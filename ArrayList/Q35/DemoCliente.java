import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente cliente; // Referencia um cliente
        int id = 0;
        String nome;
        int idade;
        String telefone;

        ArrayList<Cliente> clientes = new ArrayList<>();

        while(id >= 0) {
            System.out.print("Digite o id de um cliente: ");
            id = Integer.parseInt(sc.nextLine());

            if(id < 0) {
                break;
            }

            System.out.print("Digite o nome do cliente: ");
            nome = sc.nextLine();

            System.out.print("Digite a idade do cliente: ");
            idade = Integer.parseInt(sc.nextLine());
            
            System.out.print("Digite o telefone do cliente: ");
            telefone = sc.nextLine();

            cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);

        }
        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }

        sc.close();
    }
}
