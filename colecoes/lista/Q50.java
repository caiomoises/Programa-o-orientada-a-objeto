/*
 * Utilizando uma pilha, escreva um programa que verifique se uma String de entrada for-
 * mada apenas por ’(’ e ’)’ está balanceada.
 */

import java.util.Stack;

public class Q50 {
    public static void main(String[] args) {
        String entrada = "(()()()())";

        System.out.println(estaBalanceada(entrada));

        entrada = "(()()()(";

        System.out.println(estaBalanceada(entrada));
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
