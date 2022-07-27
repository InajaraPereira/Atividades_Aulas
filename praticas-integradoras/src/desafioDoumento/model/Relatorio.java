package desafioDoumento.model;

public class Relatorio extends  Documento{

    private int numeroPaginas;
    private String autor;
    private String textoComprimento;
    private String revisor;

    public Relatorio(int numeroPaginas, String autor, String textoComprimento, String revisor) {
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.textoComprimento = textoComprimento;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", textoComprimento='" + textoComprimento + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
