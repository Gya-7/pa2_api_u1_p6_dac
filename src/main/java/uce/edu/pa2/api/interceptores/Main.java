package uce.edu.pa2.api.interceptores;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication{


        @Inject
        private ProcesadorVentaServiceTiempo procesadorVentaService;

        @Inject
        private InventarioService inventarioService;


        @Override
        public int run (String... args){
        
            Venta v1 = new Venta("Dayerlin Aguilar", 70);
            this.procesadorVentaService.procesar(v1);
            this.procesadorVentaService.reprocesar(v1);

            System.out.println("\n--------------------------");
            this.inventarioService.registrar("Camarones");

          
            return 0;
        }

          
    }



}
