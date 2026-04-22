package uce.edu.pa2.api.acceso;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private ClaseIntermedia claseIntermedia;
        @Inject
        private EstadoVueloGlobal estadoVueloGlobal;
        @Inject
        private PoliticaVuelo politicaVuelo;
        @Inject
        private ValidarPasajero validarPasajero;

        @Override
        public int run(String... args) {

            System.out.println("********** AMBITO APPLICATION **********");
            System.out.println(estadoVueloGlobal);
            System.out.println("Asiento: " + this.estadoVueloGlobal.aumentar());
            System.out.println("Asiento: " + this.estadoVueloGlobal.aumentar());
            this.claseIntermedia.imprimirObjetoValorApplication();

            System.out.println("\n********** AMBITO SINGLETON **********");
            System.out.println(politicaVuelo);
            System.out.println("Capacidad: " + this.politicaVuelo.capacidadMaxima());
            this.claseIntermedia.imprimirObjetoValorSingleton();

            System.out.println("\n********** AMBITO DEPENDENT **********");
            System.out.println(validarPasajero);
            System.out.println("Edad: " + this.validarPasajero.validarEdad(20));
            System.out.println("Edad: " + this.validarPasajero.validarEdad(21));
            this.claseIntermedia.imprimirObjetoValorDependent();

            System.out.println("\n******** PROCESO DE RESERVA FINAL ********");
            System.out.println("Nueva Reserva");
            this.claseIntermedia.procesarReserva(25);

            return 0;
        }
    

    }
}
