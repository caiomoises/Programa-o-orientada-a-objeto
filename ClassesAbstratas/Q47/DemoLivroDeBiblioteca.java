public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 1954, false, "A1", "Fantasia");
        System.out.println(livro);
        livro.empresta();
        System.out.println(livro);
        livro.empresta();
        System.out.println(livro);
        livro.devolve();
        System.out.println(livro);
        livro.devolve();
        System.out.println(livro);
    }
}
