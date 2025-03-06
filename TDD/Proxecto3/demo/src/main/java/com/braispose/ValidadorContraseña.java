package com.braispose;
public class ValidadorContraseña {

    public boolean ValidadorContraseña(String contrasinal){
        if (contrasinal.length() < 8) return false;
        int cont = 0;
        for(int i = 0; i < 8;i++){
            if ((contrasinal.charAt(i) >= 'A' && contrasinal.charAt(i) <= 'Z')) cont++;
        }
        if (cont == 0) return false;

        int cont2 = 0;
        for(int i = 0; i < 8;i++){
            if ((contrasinal.charAt(i) >= 'a' && contrasinal.charAt(i) <= 'z')) cont2++;
        }
        if (cont2 == 0) return false;

        int cont3 = 0;
        for(int i = 0; i < 8;i++){
            if ((contrasinal.charAt(i) >= '0' && contrasinal.charAt(i) <= '9')) cont2++;
        }
        if (cont3 == 0) return false;
        if (!(contrasinal.matches(".*[!@#$%^&*].*")))return false;

        return true;
    }
}