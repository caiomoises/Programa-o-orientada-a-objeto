public class Array2D {
    private float[][] matriz;

    public Array2D(float[][] array) {
        matriz = array;
    }

    public float determinante() {
        return (matriz[0][0] * matriz[1][1]) - matriz[0][1] * matriz[1][0];
    }

    public void getMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
