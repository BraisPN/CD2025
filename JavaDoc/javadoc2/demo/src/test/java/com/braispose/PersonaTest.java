package com.braispose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    void setEdadTest() {
        final int edad = 10;
        final int novaEdad = 18;
        Persona p1 = new Persona("Pepe", edad);
        p1.setEdad(novaEdad);
        assertEquals(novaEdad, p1.getEdad());
    }

    @Test
    void setNombreTest() {
        final int edad = 10;
        Persona p1 = new Persona("Pepe", edad);
        p1.setNombre("Pepa");
        assertEquals("Pepa", p1.getNombre());
    }
}
