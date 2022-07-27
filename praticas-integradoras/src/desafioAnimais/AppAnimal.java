package desafioAnimais;

import desafioAnimais.entity.Cachorro;
import desafioAnimais.entity.Gato;
import desafioAnimais.entity.Vaca;

public class AppAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.comerCarne();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.comerCarne();

        Vaca vaca = new Vaca();
        vaca.emitirSom();
        vaca.comerPasto();

    }
}
