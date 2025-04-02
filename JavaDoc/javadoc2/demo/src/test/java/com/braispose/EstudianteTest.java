package com.braispose;

import org.junit.jupiter.api.Test;

import com.braispose.circulo.Estudiante;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class EstudianteTest {

    @Test
    void testConstructorYGetters() {
        Estudiante estudiante = new Estudiante("Juan", 20);
        assertEquals("Juan", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion());
    }

    @Test
    void testSetters() {
        Estudiante estudiante = new Estudiante("Maria", 22);
        estudiante.setNombre("Carlos");
        estudiante.setEdad(25);
        estudiante.setCalificacion(8.5);

        assertEquals("Carlos", estudiante.getNombre());
        assertEquals(25, estudiante.getEdad());
        assertEquals(8.5, estudiante.getCalificacion());
    }

    @Test
    void testAprobo() {
        Estudiante estudiante = new Estudiante("Ana", 18);
        estudiante.setCalificacion(6.0);
        assertTrue(estudiante.aprobo());

        estudiante.setCalificacion(4.9);
        assertFalse(estudiante.aprobo());
    }

    @Test
    void testEdadEscolar() {
        Estudiante estudiante = new Estudiante("Luis", 24);
        assertEquals(2, estudiante.edadEscolar()); // 24 / 12 = 2
    }

    @Test
    void testEsUniversitario() {
        Estudiante estudiante = new Estudiante("Elena", 17);
        assertFalse(estudiante.esUniversitario());

        estudiante.setEdad(18);
        assertTrue(estudiante.esUniversitario());
    }


}
