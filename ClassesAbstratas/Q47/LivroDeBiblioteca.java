public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean estaEmprestado;
    private String localizacao;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDeEdicao, boolean estaEmprestado, String localizacao, String descricao) {
        super(titulo, autor, autor, descricao);
        this.estaEmprestado = estaEmprestado;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    public boolean estaEmprestado() {
        if (estaEmprestado) {
            return true;
        }

        return false;
    }

    public void empresta() {
        if (!estaEmprestado()) {
            this.estaEmprestado = true;
            System.out.println("livro emprestado com sucesso!");
        } else {
            System.out.println("este livro já está emprestado!");
        }
    }

    public void devolve() {
        if (estaEmprestado()) {
            this.estaEmprestado = false;
            System.out.println("livro devolvido com sucesso!");
        } else {
            System.out.println("este livro não foi emprestado!");
        }
    }

    public String localizacao() {
        return this.localizacao;
    }

    public String descricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return super.toString() + ", esta emprestado? " + estaEmprestado + ", localizacao: " + localizacao
                + ", descricao: " + descricao;
    }

}