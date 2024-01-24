public class DemoFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura(1, "Laranja", 10, 0);
        Fatura F2 = new Fatura(3, "Uva", 2, 2.5);

        System.out.println(f1.quantidade + " " + 
        f1.descricao + " ao preço de " + 
        f1.preco + " = " + "R$" + 
        f1.calculaTotal());

        System.out.println(F2.quantidade + " " + 
        F2.descricao + " ao preço de " + 
        F2.preco + " = " + "R$" + 
        F2.calculaTotal());
    }
}
