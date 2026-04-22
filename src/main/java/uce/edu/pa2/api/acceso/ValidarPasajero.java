package uce.edu.pa2.api.acceso;

import jakarta.enterprise.context.Dependent;

@Dependent
public class ValidarPasajero {


    public boolean validarEdad(int edad){
        if(edad > 15){
            return true;
        } else {
            return false;
        }
    }

}
