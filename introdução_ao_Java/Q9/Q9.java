import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int naipe, valorCarta;
        String cartaPorExtenso;

        Scanner  input = new Scanner(System.in);
        System.out.print("Digite o valor da carta (de 1 a 13): ");
        valorCarta = input.nextInt();

        System.out.print("Digite o naipe (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        naipe = input.nextInt();

        cartaPorExtenso = obterCartaPorExtenso(valorCarta, naipe);

        input.close();

        if (cartaPorExtenso != null) {
            System.out.println("Carta: " + cartaPorExtenso);
        } else {
            System.out.println("Valores inválidos.");
        }
    }

    private static String obterCartaPorExtenso(int valor, int naipe) {
        String[] nomes = {"", "Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] naipes = {"", "Ouros", "Paus", "Copas", "Espadas"};

        if (valor >= 1 && valor <= 13 && naipe >= 1 && naipe <= 4) {
            return nomes[valor] + " de " + naipes[naipe];
        } else {
            return null;
        }
    }
}
