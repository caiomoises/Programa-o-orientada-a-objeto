package media;

public class Media {
    public static void main(String[] args) {
        System.out.println("Media de 2 números: " + media(2.5, 3.5));
        System.out.println("Media de 3 numeros: " + media(3, 5, 6));
        System.out.println("Media de 4 numeros: " + media(3, 5, 6, 7));
        System.out.println("Media de 5 numeros: " + media(3, 5, 6, 7, 8));
        System.out.println("Media de 6 numeros: " + media(3, 5, 6, 7, 8, 9));
    }

    public static double media(double...numeros){
        double soma = 0.0;
        for (double d : numeros) {
            soma += d;
        }
        return soma/numeros.length;
    }
}
