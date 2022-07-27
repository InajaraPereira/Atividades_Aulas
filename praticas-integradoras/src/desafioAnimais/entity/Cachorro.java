package desafioAnimais.entity;

import desafioAnimais.model.Carnivoros;

public class Cachorro extends Animal implements Carnivoros {

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne!");
    }
}
