package desafio04;

public class Pereciveis extends Produto {

    private int diasParaVencer;

    public int getDiaParaVencer() {
        return diasParaVencer;
    }

    public void setDiaParaVencer(int diaParaVencer) {
        this.diasParaVencer = diaParaVencer;
    }

    public Pereciveis(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    public int calcular(int quantidadeDeProdutos, int diasParaVencer) {
        int retornoCalculo = super.calcular(quantidadeDeProdutos);
        if (diasParaVencer == 1) {
            return retornoCalculo / 4;
        } else if (diasParaVencer == 2) {
            return retornoCalculo / 3;
        } else {
            return retornoCalculo / 2;
        }
    }
}
