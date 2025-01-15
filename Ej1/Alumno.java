package Ej1;

import java.sql.Date;

public class Alumno extends Persona{
    private String  codigoXade;
    private boolean autorizaTutores;
    
    public Alumno(String dni, String nombre, String apellido1, String apellido2, String correo, Integer movil,
            Date fecNacimiento, String codigoXade, boolean autorizaTutores) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.codigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }

    public String getCodigoXade() {
        return codigoXade;
    }

    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }

    public boolean isAutorizaTutores() {
        return autorizaTutores;
    }

    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }

    @Override
    public String toString() {
        return "Alumno [codigoXade=" + codigoXade + ", autorizaTutores=" + autorizaTutores + "]";
    }

    
}
