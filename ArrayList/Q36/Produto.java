public class Produto {
    public int calculaProduto(int... numeros) {
        int total = 1;

        for (int numero : numeros) {
            total *= numero;
        }

        return total;
    }
}
