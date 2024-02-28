public class DemoPagamento {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(23.25, 2);
        EmpregadoAssalariado empregado = new EmpregadoAssalariado("Moisés", "0321532", 600.00);

        custoPagamento(empregado);
        custoPagamento(fatura);

    }

    public static void custoPagamento(Pagavel pagavel) {
        System.out.println("Custo do pagamento = " + pagavel.obterPagamento());
    }
}

