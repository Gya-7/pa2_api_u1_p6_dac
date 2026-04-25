package uce.edu.pa2.api.taller7;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaEnLineaService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @Inject //Se vuelve a inyectar tracking venta
    private TrackingVenta trackingVenta;

    public void procesar(Venta venta) {

        this.trackingVenta.iniciar();

        //inicia la venta
        System.out.println("Procesando pedido");
        //consultando el stock de cada item
        //consultando en la base de datos
        //finalizar venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(100);

        } catch (Exception e) {

        }
        this.trackingVenta.finalizar();

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

}
