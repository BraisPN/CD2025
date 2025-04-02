package com.braispose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.braispose.circulo.Circulo;

public class CirculoTest {
    @Test
    void establecerXTest(){
        Circulo c1 = new Circulo(0, 0, 0);
        c1.establecerX(3);
        assertEquals(3, c1.obtenerX());
    }
}
