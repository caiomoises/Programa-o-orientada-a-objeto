/*
 * Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um
 * segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa.
 * Não devem ser utilizados métodos da Java API para realizar a inversão.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class Q48 {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'));

        LinkedList<Character> list2 = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }

        System.out.println("Lista 1: " + list);
        System.out.println("Lista 2: " + list2);
    }
}
