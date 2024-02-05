package pascal;

public class Pascal {
    private int[][] tri;

    Pascal(int linhas) {
        tri = new int[linhas][];
        for (int l = 0; l < tri.length; l++) {
            tri[l] = new int[l+2];
            tri[l][0] = 1;
            tri[l][tri[l].length-1] = 1; // ultimo indice de coluna da linha l
            for (int c = 1; c < tri[l].length-1; c++) {
                tri[l][c] = tri[l-1][c] + tri[l-1][c-1];
            }
        }
    }

    public String toString() {
        String res = " ";
        for (int l = 0; l < tri.length; l++) {
            for (int c = 0; c < tri[l].length; c++) {
                res += tri[l][c] + " ";
            }
            res += '\n';
        }
        return res;
    }
}
