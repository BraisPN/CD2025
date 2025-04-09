package com.braispose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.braispose.circulo.Circulo;
import org.junit.jupiter.api.Test;

/**
 * Test de Circulo.
 */
public class CirculoTest {
    @Test
    void establecerXTest() {
        Circulo c1 = new Circulo(0, 0, 0);
        final int valorX = 3;
        final int esperado = 3;
        c1.establecerX(valorX);
        assertEquals(esperado, c1.obtenerX());
    }
}
