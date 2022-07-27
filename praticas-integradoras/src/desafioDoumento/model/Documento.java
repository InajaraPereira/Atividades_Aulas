package desafioDoumento.model;

import desafioDoumento.util.Imprimir;

public abstract class Documento {

    public void imprimir(Imprimir impressora) {
        impressora.imprimir(this);
    }
}
