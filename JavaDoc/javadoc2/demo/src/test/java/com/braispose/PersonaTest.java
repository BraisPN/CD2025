package com.braispose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import com.braispose.circulo.Persona;

public class PersonaTest {

    @Test
    void setEdadTest() {
        Persona p1 = new Persona("Pepe", 10);
        p1.setEdad(18);
        assertEquals(18, p1.getEdad());
    }
    @Test
    void setNombreTest() {
        Persona p1 = new Persona("Pepe", 10);
        p1.setNombre("Pepa");
        assertEquals("Pepa", p1.getNombre());
    }
}
