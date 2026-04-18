package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication{

        @Inject
        PedidoService pedidoService;

         @Inject
        PagoTarjetaCredito pagoT;

         @Inject
         PagoEfectivo pagoE;

          @Override
        public int run(String... args) {
                Pedido pedido = new Pedido("Dayerlin Aguilar", "Coca Cola", 1200, null );
                this.pedidoService.registrar(pedido, pagoE);
                

                Pedido pedido2 = new Pedido("Dayerlin Aguilar", "Coca Cola", 80, "dgdac.7@gmail.com");
                this.pedidoService.registrar(pedido2, pagoT);

                return 0;
         }
    }
}
