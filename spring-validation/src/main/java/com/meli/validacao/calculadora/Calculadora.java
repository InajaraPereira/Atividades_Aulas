package com.meli.validacao.calculadora;

public class Calculadora {

    private double n1, n2;

    public Calculadora(double n1, double n2) {
    }

    public double dividir(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        } else {
            return n1 / n2;
        }
    }
}
