public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String ano;

    public Livro(String titulo, String autor, String editora, String ano) {
        this.titulo = titulo;
        this.autor  = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\nTitulo do livro: " + titulo
        + "\nAutor: " + autor
        + "\nEditora: " + editora
        + "\nAno: " + ano;
    }
}
