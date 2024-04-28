public class DemoLivraria {
    public static void main(String[] args) {
        LivroBiblioteca biblioteca  = new LivroBiblioteca("As cronicas de Narnia", "CS Lews", "Novas", "2005", "0026", 350, 12345);
        LivroLivraria livraria = new LivroLivraria("Biblia", "Deus", "James", "1611", 10, 45.00);


        System.out.println(biblioteca);
        System.out.println();
        System.out.println(livraria);
    }
}
