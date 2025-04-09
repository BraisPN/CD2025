package com.braispose.circulo;

import java.text.DecimalFormat;
/**
 * Clase Main en donde se ejecuta el programa.
 */

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Clase de utilidad");
    }
    /**
     * Programa principal en el que se crea un circulo y se va mostrando y modificando su posición y tamaño.
     * @param args
     */

    public static void main(String[] args) {
        final int valorX = 37;
        final int valorY = 43;
        final double valorRadio = 2.5;
        Circulo circulo = new Circulo(valorX, valorY, valorRadio);
        String salida =
                  "La coordenada X es " + circulo.obtenerX()
                + "\nLa coordenada Y es " + circulo.obtenerY()
                + "\nEl radio es " + circulo.obtenerRadio();
        final int valorX2 = 35;
        circulo.establecerX(valorX2);
        final int valorY2 = 20;
        circulo.establecerY(valorY2);
        final double valorRadio2 = 4.2;
        circulo.establecerRadio(valorRadio2);
        salida += "\n\nLa nueva ubicación y el radio de círculo son\n" + circulo.toString();
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida += "\nEl diámetro es " + dosDigitos.format(circulo.obtenerDiametro());
        salida += "\nLa circunferencia es " + dosDigitos.format(circulo.obtenerCircunferencia());
        salida += "\nEl área es " + dosDigitos.format(circulo.obtenerArea());
        System.out.println(salida);
        System.exit(0);
    }
}
