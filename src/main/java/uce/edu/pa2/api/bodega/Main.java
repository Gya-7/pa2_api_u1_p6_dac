package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService pedidoService;

        /*
        Modelos Icon
        1. DI
        @Inject
        private PedidoService pedidoService;
         */
        //2. Service Locator (Lookuop)
        //private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) {

            /* 
            PedidoService1 pedidoService1 = CDI.current().select(PedidoService1.class).get();
            Pedido pedido = new Pedido("Dayerlin Aguilar",
                    "Coca Cola", 1200, "dgdac.7@gmail.com");

            pedidoService1.registrar(pedido);
            */

            Pedido pedido = new Pedido("Dayerlin Aguilar",
                    "Coca Cola", 1200, "dgdac.7@gmail.com");
            PedidoService pedidoService = CDI.current().select(PedidoService.class).get();
            pedidoService.registrar(pedido);

            /* 

            //Caso 1
            Pedido pedido = new Pedido("Dayerlin Aguilar",
                    "Coca Cola", 1200, "dgdac.7@gmail.com");
            pedidoService.registrar(pedido);

            System.out.println("\n");
            //Caso 2 
            Pedido pedido2 = new Pedido("Dayerlin Aguilar",
                    "Coca Cola", 80, "0999999999");
            pedidoService.registrar(pedido2);

            System.out.println("\n");
            //Caso 3
            Pedido pedido3 = new Pedido("Dayerlin Aguilar",
                    "Coca Cola", 36, "0999999999");
            pedidoService.registrar(pedido3);
            */
            

            return 0;

        }
    }

}
