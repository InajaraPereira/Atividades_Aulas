package desafio01;

public class Participante {

    private Long id;
    private int numeroInscricao;
    private String nome;
    private String sobrenome;
    private String rg;
    private int idade;
    private String numeroCelular;
    private String numeroEmergencia;
    private String grupoSanguineo;
    private String categoria;
    private double valorInscricao;

    public Participante(Long id, int numeroInscricao, String nome, String sobrenome, String rg, int idade, String numeroCelular,
                        String numeroEmergencia, String grupoSanguineo, String categoria) {
        this.id = id;
        this.numeroInscricao = numeroInscricao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public double calculaIncricao(Participante participante) {
        if (participante.getIdade() < 18) {
            if (participante.getCategoria().equals("pequeno")) {
                return 1.300;
            } else {
                return 2.000;
            }
        } else {
            if (participante.getCategoria().equals("pequeno")) {
                return 1.500;
            } else if (participante.getCategoria().equals("medio")) {
                return 2.300;
            } else {
                return 2.800;
            }
        }
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                ", numeroInscricao=" + numeroInscricao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg='" + rg + '\'' +
                ", idade=" + idade +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", numeroEmergencia='" + numeroEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valorInscricao=" + valorInscricao +
                '}';
    }
}
