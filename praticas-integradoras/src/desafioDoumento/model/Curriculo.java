package desafioDoumento.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Documento{

    private String nome;
    private List<String> habilidades;

    public Curriculo(String nome, List<String> habilidades) {
        this.nome = nome;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", habilidades=" + habilidades +
                '}';
    }
}
