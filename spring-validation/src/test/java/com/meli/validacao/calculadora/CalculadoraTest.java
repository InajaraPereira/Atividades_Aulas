package com.meli.validacao.calculadora;

import com.meli.validacao.calculadora.util.CalculadoraCreate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = CalculadoraCreate.createValid();
    }

    @Test
    @DisplayName("Valida divisão de numeros positos.")
    void dividirNumerosPositivo() {
        Double retorno = calculadora.dividir(4, 2);
        assertEquals(2, retorno);
        assertNotNull(retorno);
        assertNotEquals(0, retorno);
    }

    @Test
    @DisplayName("Valida divisão de numeros por zero.")
    void dividirPorZero() {
        assertEquals(0, calculadora.dividir(2, 0));
    }
}