package desafioGaragem;

import java.util.List;

public class Garagem {

    private Long id;
    private List<Veiculo> veiculos;

    public Garagem() {
    }

    public Garagem(Long id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
