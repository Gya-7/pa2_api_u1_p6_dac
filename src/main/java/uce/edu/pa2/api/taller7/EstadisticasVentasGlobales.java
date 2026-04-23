package uce.edu.pa2.api.taller7;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadisticasVentasGlobales {

    private int totalVentas = 0;
    private double montoTotalVendio = 0;

    public void registrarVenta(double totalVentaIndividual){
        this.totalVentas++;
        this.montoTotalVendio += totalVentaIndividual;

    }

    public void mostrarEstadisticasGlobales(){
        System.out.println("********* ESTADISTICAS GLOBALES *********");
        System.out.println("Cantidad de ventas: " + this.totalVentas);
        System.out.println("Valor total vendido: " + this.montoTotalVendio);
    }

}
