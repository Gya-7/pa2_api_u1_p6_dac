package uce.edu.pa2.api.interceptores;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    // Antes de ejecutarse el metodo procesar se va a ejecutar todo lo que esta arriba de context proceed
    //Cuando se llegue al proceed, se ejecuta el procesar y cuando termine se regresa a debajo de procesar
    @MedirTiempo 
    @Log
    public void procesar(Venta venta) {

        System.out.println("Entro al metodo con los siguientes valores: " + venta.getCliente());


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

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

        System.out.println("Pedido procesado");

        //this.reprocesar(venta); //no se va a ejecutar el interceptor en el metodo, porque es una llamada interna 

    }

    @MedirTiempo
    public void reprocesar(Venta venta) {

        //inicia la venta
        System.out.println("Reprocesando pedido");
        //consultando el stock de cada item
        //consultando en la base de datos
        //finalizar venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(250);

        } catch (Exception e) {

        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

        System.out.println("Pedido reprocesado");

    }
}
