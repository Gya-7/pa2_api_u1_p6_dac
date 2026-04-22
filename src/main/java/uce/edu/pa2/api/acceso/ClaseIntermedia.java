package uce.edu.pa2.api.acceso;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {

    @Inject
    private PoliticaVuelo politicaVuelo;
    @Inject
    private EstadoVueloGlobal estadoVueloGlobal;
    @Inject
    private ValidarPasajero validarPasajero;

    public void procesarReserva(int edad){

        if (validarPasajero.validarEdad(edad)) {
            if (politicaVuelo.hayCuposDispoibles(estadoVueloGlobal.contarAsientos())){
                estadoVueloGlobal.aumentar();
                System.out.println("Se ha reservado el asiento");
            } else{ 
                System.err.println("No es posible realizar la reserva, el vuelo esta lleno");
            }

        } else {
            System.out.println("La edad de la persona se encuentra por debajo de los limites permitidos");
        }

    }

    public void imprimirObjetoValorApplication() {
        System.out.println(estadoVueloGlobal);
    }

    public void imprimirObjetoValorSingleton() {
        System.out.println(politicaVuelo);
    }

    public void imprimirObjetoValorDependent() {
        System.out.println(validarPasajero);
    }

}
