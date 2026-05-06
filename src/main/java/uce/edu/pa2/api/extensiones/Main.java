package uce.edu.pa2.api.extensiones;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorCompraService compraService;


        @Override
        public int run(String... args) {

            Compra comp1 = new Compra("Dayerlin Aguilar", 100.0);
            System.out.println("-------------------");
            System.out.println("Valor inicial: " + comp1.getSubTotal());
            System.out.println("Procesando compra...");
            this.compraService.procesar(comp1);
            System.out.println("-------------------");


            return 0;
        }

    }

}
