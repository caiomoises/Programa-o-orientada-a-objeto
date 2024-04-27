public class DemoFatura {
    public static void main(String[] args) {
        FaturaF F1 = new FaturaF(1, "Maça", 5, 1.5);
        FaturaF F2 = new FaturaF(2, "PERA", 5, 3.00);

        System.out.println(F1.quant + " " + 
        F1.descricao + " ao preco de " + 
        F1.preco + " = " + 
        F1.calculaFatura());

        System.out.println(F2.quant + " " + 
        F2.descricao + " ao preco de " + 
        F2.preco + " = " + 
        F2.calculaFatura());
    } 
}