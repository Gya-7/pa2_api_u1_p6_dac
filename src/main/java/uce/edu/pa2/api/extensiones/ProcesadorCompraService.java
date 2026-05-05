package uce.edu.pa2.api.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    /*
    @Inject
    private DescuentoIVA descuentoIVA;
    //Si se pone una interfaz, da problemas cuando se quiere acoplar mas clases
     */
    //Simula una implementacion de aplicaciones que se van a ir agregando en el futuro
    @Inject
    private Instance<Descuento> descuentos;
    //Va a detectar todas las implementaciones que tiene mi sistema y las va a tratar como una lista

    public void procesar(Compra compra) {

        /* PROGRAMACION MUY ACOPLADA
        double valorAPagar = this.descuentoIVA.aplicar(compra.getSubTotal());

        System.out.println("Su valor a pagar es: " + valorAPagar);
         */
        double total = compra.getSubTotal();

        for (Descuento des : descuentos) {

            total = des.aplicar(total);
        }

        compra.setTotal(total);

        System.out.println("Su valor a pagar es: " + compra.getTotal());

    }

}
