package com.braispose;

public class Fecha {

    // Constantes estáticas primero (según Checkstyle)
    private static final int DIA_MINIMO = 1;
    private static final int DIA_MAXIMO = 31;
    private static final int MES_MINIMO = 1;
    private static final int MES_MAXIMO = 12;
    private static final int DIAS_FEBRERO_NORMAL = 28;
    private static final int DIAS_FEBRERO_BISIESTO = 29;
    private static final int DIAS_MES_30 = 30;
    private static final int DIAS_MES_31 = 31;

    // Constantes para los meses
    private static final int ENERO = 1;
    private static final int FEBRERO = 2;
    private static final int MARZO = 3;
    private static final int ABRIL = 4;
    private static final int MAYO = 5;
    private static final int JUNIO = 6;
    private static final int JULIO = 7;
    private static final int AGOSTO = 8;
    private static final int SEPTIEMBRE = 9;
    private static final int OCTUBRE = 10;
    private static final int NOVIEMBRE = 11;
    private static final int DICIEMBRE = 12;

    // Variables de instancia
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {
        if (dia < DIA_MINIMO || dia > DIA_MAXIMO) {
            return false;
        }
        if (mes < MES_MINIMO || mes > MES_MAXIMO) {
            return false;
        }

        // Determinamos la cantidad de días del mes
        int diasMes = 0;

        switch (mes) {
            case ENERO: case MARZO: case MAYO: case JULIO:
            case AGOSTO: case OCTUBRE: case DICIEMBRE:
                diasMes = DIAS_MES_31;
                break;

            case ABRIL: case JUNIO: case SEPTIEMBRE: case NOVIEMBRE:
                diasMes = DIAS_MES_30;
                break;

            case FEBRERO: // Verificación de año bisiesto
                if (anio % 400 == 0 || (anio % 4 == 0) && (anio % 100 != 0)) {
                    diasMes = DIAS_FEBRERO_BISIESTO;
                } else {
                    diasMes = DIAS_FEBRERO_NORMAL;
                }
                break;

            default:
                return false;
        }

        return dia <= diasMes;
    }
}
