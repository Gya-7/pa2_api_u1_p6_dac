package uce.edu.pa2.api.tarea5;

import io.quarkus.runtime.Quarkus;
import jakarta.inject.Inject;

public class Main {

    public static void main(String[] args) {
        
        Quarkus.run(App.class, args);
    }

    public static class App implements io.quarkus.runtime.QuarkusApplication {

        @Inject
        private ProcesadorService procesadorService;

        @Override
        public int run(String... args) {

            Paquete paquete = new Paquete("Aguilar", 6, 120, true); 
            System.out.println(" -------------------------------------------------------------------- ");
            System.out.println("Procesando paquete para: " + paquete.getCliente());
            procesadorService.procesar(paquete);
            return 0;
        }

    }

}
