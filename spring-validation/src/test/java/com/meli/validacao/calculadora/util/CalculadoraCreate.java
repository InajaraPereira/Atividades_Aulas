package com.meli.validacao.calculadora.util;

import com.meli.validacao.calculadora.Calculadora;
import lombok.Data;

@Data
public class CalculadoraCreate {

    private static double n1 = 4, n2 = 2;

    public static Calculadora createValid() {
        return new Calculadora(n1, n2);
    }

    public static Calculadora createWithZero() {
        return new Calculadora(n1, 0);
    }

}
