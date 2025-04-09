package com.braispose.circulo;

/**
 * La clase Estudiante sirve para crear estudiantes con nombre, edad e
 * calificacion.
 */
public class Estudiante {
    private static final int MINIMO_APROBAR = 5;
    private static final int MAYORIA_EDAD = 18;
    private static final int EDAD_ESCOLAR = 12;

    private String nombre;
    private int edad;
    private double calificacion;

    /**
     * Crea un estudiante con nombre y edad asignados.
     * @param nombre String con el nombre do estudiante
     * @param edad  int con la edad del estudiante
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece la calificacion del estudiante.
     * @param calificacion esta es la calificación que se asigna
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Devuelve el nombre de un estudiante.
     * @return este es el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * @param nombre este es el nombre asignado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad de un estudiante.
     * @return esta es la edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Establece la edad del estudiante.
     * @param edad esta es la edad asignada
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Devuelve la calificacion de un estuiante.
     * @return  esta es la calificacion
     */

    public double getCalificacion() {
        return calificacion;
    }
    /**
     * Comprueba y un estudiante aprobó.
     * @return devuelve true si el estudiante aprobó
     */

    public boolean aprobo() {
        return calificacion >= MINIMO_APROBAR;
    }
    /**
     * Calcula la edad escolar.
     * @return devuelve la edad escolar
     */

    public int edadEscolar() {
        return edad / EDAD_ESCOLAR;
    }
    /**
     * Comprueba si un estudiante es universitario.
     * @return devuelve true si es universitario
     */

    public boolean esUniversitario() {
        return edad >= MAYORIA_EDAD;
    }
    /**
     * Imprime toda la información del estudiante.
     */

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}
