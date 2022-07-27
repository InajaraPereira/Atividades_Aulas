package desafioDoumento.util;

import desafioDoumento.model.Documento;

public class ImpressoraHp implements Imprimir{

    @Override
    public void imprimir(Documento documento) {
        System.out.println(documento);
    }
}
