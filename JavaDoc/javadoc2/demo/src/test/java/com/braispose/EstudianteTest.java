package com.braispose;

import static org.junit.jupiter.api.Assertions.*;

import com.braispose.circulo.Estudiante;
import org.junit.jupiter.api.Test;

class EstudianteTest {

    @Test
    void testConstructorYGetters() {
        final int edad = 20;
        Estudiante estudiante = new Estudiante("Juan", edad);
        assertEquals("Juan", estudiante.getNombre());
        assertEquals(edad, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion());
    }

    @Test
    void testSetters() {
        final int edad = 22;
        final int novaEdad = 25;
        final double calificacion = 8.5;
        Estudiante estudiante = new Estudiante("Maria", edad);
        estudiante.setNombre("Carlos");
        estudiante.setEdad(novaEdad);
        estudiante.setCalificacion(calificacion);

        assertEquals("Carlos", estudiante.getNombre());
        assertEquals(novaEdad, estudiante.getEdad());
        assertEquals(calificacion, estudiante.getCalificacion());
    }

    @Test
    void testAprobo() {
        final int edad = 22;
        final double calificacion = 8.5;
        final double novaCalificacion = 4.9;
        Estudiante estudiante = new Estudiante("Ana", edad);
        estudiante.setCalificacion(calificacion);
        assertTrue(estudiante.aprobo());

        estudiante.setCalificacion(novaCalificacion);
        assertFalse(estudiante.aprobo());
    }

    @Test
    void testEdadEscolar() {
        final int edad = 24;
        Estudiante estudiante = new Estudiante("Luis", edad);
        assertEquals(2, estudiante.edadEscolar()); // 24 / 12 = 2
    }

    @Test
    void testEsUniversitario() {
        final int edad = 17;
        Estudiante estudiante = new Estudiante("Elena", edad);
        assertFalse(estudiante.esUniversitario());

        estudiante.setEdad(edad + 1);
        assertTrue(estudiante.esUniversitario());
    }

}
