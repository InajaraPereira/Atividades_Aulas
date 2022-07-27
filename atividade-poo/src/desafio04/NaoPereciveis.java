package desafio04;

public class NaoPereciveis extends Pereciveis {

    private String tipo;


    public NaoPereciveis(int diasParaVencer, String tipo) {
        super(diasParaVencer);
        this.tipo = tipo;
    }

    public NaoPereciveis(String nome, double preco, int diasParaVencer, String tipo) {
        super(nome, preco, diasParaVencer);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public int calcular(int quantidadeDeProdutos, int diasParaVencer) {
        return super.calcular(quantidadeDeProdutos, diasParaVencer);
    }
}
