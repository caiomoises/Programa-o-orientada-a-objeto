import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiro = 0, segundo=1, cont=0, n, aux;
        
        System.out.println("Informe o n-ézimo termo da sequencia: ");
        n = input.nextInt();

        while (cont < n) {
            System.out.print(" " + segundo);

            aux = segundo;
            segundo = primeiro + segundo;
            primeiro = aux;

            cont++;
        }
        System.out.println("");
        input.close();
    }
}
