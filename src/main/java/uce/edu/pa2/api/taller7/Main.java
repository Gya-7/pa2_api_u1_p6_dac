package uce.edu.pa2.api.taller7;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication{


        @Inject
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaEnLineaService procesadorVentaEnLineaService;

        @Override
        public int run (String... args){
        
            Venta v1 = new Venta("Dayerlin Aguilar", 70);
            //Solo se crea un objeto pero lo que se vuelve a ejecutar es el metodo
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Daniel Teran", 40);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Pablo Castillo", 20);
            this.procesadorVentaService.procesar(v3);

            Venta v4 = new Venta("Pablo", 100);
            this.procesadorVentaService1.procesar(v4);

            Venta v5 = new Venta("Pablo", 30);
            this.procesadorVentaService1.procesar(v5);

            Venta v6 = new Venta("Pablo", 65);
            this.procesadorVentaEnLineaService.procesar(v6);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
          
            return 0;
        }

          
    }



}
