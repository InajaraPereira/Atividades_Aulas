package desafioDoumento.model;

public class Livro extends Documento{

    private int numeroPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public Livro(int numeroPaginas, String autor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
