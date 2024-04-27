public class DemoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        System.out.println("Pruduto: " + produto.calculaProduto(1, 2, 3, 4, 5, 6));
        System.out.println("Pruduto: " + produto.calculaProduto(10, 20));
    }
}
