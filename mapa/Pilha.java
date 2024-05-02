import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        String entrada;
        Scanner input = new Scanner(System.in);

        System.out.print("informe uma entrada com ( e ): ");
        entrada = input.nextLine();

        if (estaBalanceada(entrada)) {
            System.out.println("a entrada está balanceada!");
        } else {
            System.out.println("a entrada não está balanceada!");
        }

        input.close();
    }

    public static boolean estaBalanceada(String entrada) {
        Stack<Character> pilha = new Stack<>();
        char aux;

        for (int i = 0; i < entrada.length(); i++) {
            aux = entrada.charAt(i);

            if (aux == '(') {
                pilha.push(aux);
            } else if (aux == ')') {
                if (pilha.isEmpty()) return false;

                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }
}
