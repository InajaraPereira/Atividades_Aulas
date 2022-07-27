package desafioAnimais.entity;

import desafioAnimais.model.Herbivoros;

public class Vaca extends Animal implements Herbivoros {

    @Override
    public void emitirSom() {
        System.out.println("Mu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto!");
    }
}
