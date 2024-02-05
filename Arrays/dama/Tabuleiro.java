public class Tabuleiro {
    char[][] tabela;

    Tabuleiro() {
        tabela = new char[8][8];
        for (int l = 0; l < tabela.length; l++){
            for (int c = 0; c < tabela[l].length; c++) {
                tabela[l][c] = '.';
            }
        }
    }

    public String toString() {
        String res = "";
        for (int l = 0; l < tabela.length; l++){
            for (int c = 0; c < tabela[l].length; c++) {
                tabela[l][c] = '.';
            }
        }
        return res;
    }
}
