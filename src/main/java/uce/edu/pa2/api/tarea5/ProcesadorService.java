package uce.edu.pa2.api.tarea5;

import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcesadorService {

    @Inject
    private Instance<Descuento> descuentos;

    @Inject
    private Instance<Costo> costos;

    public void procesar(Paquete paquete){

        double total = paquete.getPrecioBase();

        System.out.println("Precio base del paquete: " + total);
        System.out.println("\nCalculando costos adicionales...\n");
        
        for (Costo cos : costos) {

            total = cos.calcularValor(paquete, total);
        }

        System.out.println("\nCalculando descuentos...\n");
        for (Descuento des : descuentos) {

            total = des.calcularValorDescuento(paquete, total);
        }
        paquete.setPrecioFinal(total);

        System.out.println("\nEl precio final del paquete es: " + paquete.getPrecioFinal());
    }


}
