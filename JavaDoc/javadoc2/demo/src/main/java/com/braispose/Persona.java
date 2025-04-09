package com.braispose;

/**
 * Clase "Persona" crea objetos personas en los que se guarda su nombre y edad.
 */
public class Persona {
    /**
     * Nombre de la persona que se crea.
     */
    private String nombre;
    /**
     * Edad de la persona que se crea.
     */
    private int edad;
    /**Crea una persona con nombre y edad asignados.
     * @param nombre Nombre propio de la persona
     * @param edad Edad de la persona
     */

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /** Devuelve el nombre de la persona.
     * @return Nombre de "Persona"
     */

    public String getNombre() {
        return nombre;
    }
    /** Establece el nombre de la persona.
     * @param nombre Nombre de "Persona"
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /** Devuelve la edad de la persona.
     * @return Edad de "Persona"
     */

    public int getEdad() {
        return edad;
    }
    /** Establece la edad de la persona.
     * @param edad Edad de "Persona"
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Imprime el nombre y la edad de la persona.
     */

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
