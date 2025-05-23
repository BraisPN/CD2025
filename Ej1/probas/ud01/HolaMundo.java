package com.xulioxesus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testConstructorYGetters() {
        Producto producto = new Producto("Pan", 1.5, 4);

        assertEquals("Pan", producto.getNombre());
        assertEquals(1.5, producto.getPrecio());
        assertEquals(4, producto.getCantidad());
    }

    @Test
    void testGetTotal() {
        Producto producto = new Producto("Leche", 2.0, 3);
        assertEquals(6.0, producto.getTotal());
    }

    @Test
    void testToString() {
        Producto producto = new Producto("Huevos", 0.5, 12);
        String esperado = "Huevos - 12 x 0.5 = 6.0";
        assertEquals(esperado, producto.toString());
    }
}