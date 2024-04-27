public class Demo {
    public static void main(String[] args) {
        float[][] array1 = {{1.5f, 3.7f}, {4.8f, 7.2f}};

        Array2D matriz = new Array2D(array1);
        System.out.printf("Determinante: %.2f.\n", matriz.determinante());
        matriz.getMatriz();
    }
}