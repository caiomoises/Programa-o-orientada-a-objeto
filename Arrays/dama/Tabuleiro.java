public class Tabuleiro {
    char[][] tabela;

    Tabuleiro() {
        tabela = new char[8][8];
        for (int l = 0; l < tabela.length; l++){
            for (int c = 0; c < tabela[l].length; c++) {
                tabela[l][c] = '.';
            }
        }
        // time preto ('o')
        for (int l = 0; l <= 2; l++) {
            for (int c = 1-l%2; c < tabela.length; c+=2) {
                tabela[l][c] = 'o';
            }
        }

         // time branco ('x')
         for (int l = 5; l <= 7; l++) {
            for (int c = 1-l%2; c < tabela.length; c+=2) {
                tabela[l][c] = 'x';
            }
        }
    }

    public String toString() {
        String res = "";
        for (int l = 0; l < tabela.length; l++){
            for (int c = 0; c < tabela[l].length; c++) {
               res += tabela[l][c] + "  ";
            }
            res += '\n';
        }
        return res;
    }
}
