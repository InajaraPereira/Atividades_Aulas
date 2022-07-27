package desafioBanco.Entity;

public class Cliente {

    private Long id;
    private String nome;
    private Integer numeroConta;
    private int tipoCliente;

    public Cliente(Long id, String nome, Integer numeroConta, int tipoCliente) {
        this.id = id;
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.tipoCliente = tipoCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
