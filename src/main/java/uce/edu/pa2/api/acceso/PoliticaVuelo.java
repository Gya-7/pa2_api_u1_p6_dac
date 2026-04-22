package uce.edu.pa2.api.acceso;

import jakarta.inject.Singleton;

@Singleton
public class PoliticaVuelo {

    private int capacidadMaxima = 2;

    public int capacidadMaxima(){

        return capacidadMaxima;

    }
    public boolean hayCuposDispoibles(int asientosOcupados){

        if(capacidadMaxima > asientosOcupados){
            return true;
        } else {
            return false;
        }
    }

}
