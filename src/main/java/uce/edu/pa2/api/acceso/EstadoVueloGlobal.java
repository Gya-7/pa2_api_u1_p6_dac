package uce.edu.pa2.api.acceso;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoVueloGlobal {

    private int asientosOcupados = 0;

    public int aumentar(){
        return ++asientosOcupados;
    }

    public int contarAsientos(){
        return asientosOcupados;
    }

}
