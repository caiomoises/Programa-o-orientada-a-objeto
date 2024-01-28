public class DemoFatura {
    public static void main(String[] args) {
        Fatura F1 = new Fatura(1, "UVA", 2, 5.5);
        Fatura F2 = new Fatura(2, "PERA", 5, 3.00);

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