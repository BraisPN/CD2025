package com.braispose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.braispose.circulo.Circulo;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    @Test
    void establecerXTest() {
        Circulo c1 = new Circulo(0, 0, 0);
        final int valorX = 3;
        final int esperado = 3;
        c1.establecerX(valorX);
        assertEquals(esperado, c1.obtenerX());
    }

    @Test
    void establecerYTest() {
        Circulo c1 = new Circulo(0, 0, 0);
        final int valorY = 3;
        final int esperado = 3;
        c1.establecerY(valorY);
        assertEquals(esperado, c1.obtenerY());
    }

    @Test
    void obtenerRadioTest() {
        final int valorX1 = 2;
        final int valorY1 = 3;
        final int valorRadio1 = 4;
        Circulo c1 = new Circulo(valorX1, valorY1, valorRadio1);
        final int valorRadio = 3;
        final int esperado = 3;
        c1.establecerRadio(valorRadio);
        assertEquals(esperado, c1.obtenerRadio());
    }

    @Test
    void obtenerDiametroTest() {
        final int valorX1 = 2;
        final int valorY1 = 3;
        final int valorRadio1 = 4;
        Circulo c1 = new Circulo(valorX1, valorY1, valorRadio1);
        final int valorRadio = 3;
        final int esperado = 6;
        c1.establecerRadio(valorRadio);
        assertEquals(esperado, c1.obtenerDiametro());
    }

    @Test
    void obtenerCircunferenciaTest() {
        final int valorX1 = 2;
        final int valorY1 = 3;
        final int valorRadio1 = 4;
        Circulo c1 = new Circulo(valorX1, valorY1, valorRadio1);
        final int valorRadio = 3;
        c1.establecerRadio(valorRadio);
        assertEquals(Math.PI * c1.obtenerDiametro(), c1.obtenerCircunferencia());
    }

    @Test
    void obtenerAreaTest() {
        final int valorX1 = 2;
        final int valorY1 = 3;
        final int valorRadio1 = 4;
        Circulo c1 = new Circulo(valorX1, valorY1, valorRadio1);
        final int valorRadio = 3;
        c1.establecerRadio(valorRadio);
        final int formula = 3 * 3;
        assertEquals(Math.PI * formula, c1.obtenerArea());
    }

    @Test
    void toStringTest() {
        final int valorX1 = 2;
        final int valorY1 = 3;
        final int valorRadio1 = 4;
        Circulo c1 = new Circulo(valorX1, valorY1, valorRadio1);
        final int valorRadio = 3;
        c1.establecerRadio(valorRadio);
        final int centro1 = 2;
        final int centro2 = 3;
        final double radio = 3.0;
        assertEquals("Centro = [" + centro1 + "," + centro2 + "]; Radio = " + radio, c1.toString());
    }
}
