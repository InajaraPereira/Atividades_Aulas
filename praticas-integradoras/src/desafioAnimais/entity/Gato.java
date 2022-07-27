package desafioAnimais.entity;

import desafioAnimais.model.Carnivoros;

public class Gato extends Animal implements Carnivoros {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne!");
    }
}
