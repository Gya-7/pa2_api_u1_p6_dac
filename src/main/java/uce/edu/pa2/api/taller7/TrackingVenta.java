package uce.edu.pa2.api.taller7;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {

    private long tiempoInicio;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void reiniciar (){
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;
    }
    
    public void iniciar(){
        this.tiempoInicio =  System.currentTimeMillis();
    }

    public void finalizar(){
        long tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecución: " + tiempoEjecucion + " ms");

        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroOperaciones ++;

        System.out.println("Tiempo acumulado: " + this.tiempoTotalAcumulado + " ms");
        System.out.println("Cantidad de operaciones: " + this.numeroOperaciones);
    }

}
