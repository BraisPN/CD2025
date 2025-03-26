package com.braispose.circulo;

/**
 * Clase "Persona" crea objetos personas en los que se guarda su nombre y edad
 */
public class Persona {
    /**
     * Nombre de la persona que se crea
     */
    private String nombre;
    /**
     * Edad de la persona que se crea
     */
    private int edad;
    /**
     * Crea una persona con nombre y edad asignados
     * @param nombre Nombre propio de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * 
     * @return devuelve el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre establece el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return devuelve la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad establece la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Imprime el nombre y la edad de la persona
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
