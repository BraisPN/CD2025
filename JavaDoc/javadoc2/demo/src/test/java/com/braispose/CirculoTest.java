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
    @Test
    void establecerYTest(){
        Circulo c1 = new Circulo(0, 0, 0);
        c1.establecerY(3);
        assertEquals(3, c1.obtenerY());
    }
    @Test
    void obtenerRadioTest(){
        Circulo c1 = new Circulo(2, 3, 4);
        c1.establecerRadio(3);
        assertEquals(3, c1.obtenerRadio());
    }
    @Test
    void obtenerDiametroTest(){
        Circulo c1 = new Circulo(2, 3, 4);
        c1.establecerRadio(3);
        assertEquals(6, c1.obtenerDiametro());
    }
    @Test
    void obtenerCircunferenciaTest(){
        Circulo c1 = new Circulo(2, 3, 4);
        c1.establecerRadio(3);
        assertEquals(Math.PI * c1.obtenerDiametro(), c1.obtenerCircunferencia());
    }
    @Test
    void obtenerAreaTest(){
        Circulo c1 = new Circulo(2, 3, 4);
        c1.establecerRadio(3);
        assertEquals(Math.PI * 3 * 3, c1.obtenerArea());
    }
    @Test
    void toStringTest(){
        Circulo c1 = new Circulo(2, 3, 4);
        c1.establecerRadio(3);
        assertEquals("Centro = [" + 2 + "," + 3 + "]; Radio = " + 3.0, c1.toString());
    }
}
