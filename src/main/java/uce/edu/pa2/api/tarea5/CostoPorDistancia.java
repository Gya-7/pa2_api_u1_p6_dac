package uce.edu.pa2.api.tarea5;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class CostoPorDistancia implements Costo {

    @Override
    public double calcularValor(Paquete paquete, double valor) {

        System.out.println("Calculando costo por distancia...");
        
        if (paquete.getDistancia() > 100){

            double distanciaExcedente = paquete.getDistancia() - 100;
            System.out.println("Distancia excedente: " + distanciaExcedente + " km, costo adicional: " + (distanciaExcedente * 0.5));
            return  valor + (distanciaExcedente * 0.5);

        } else {
            System.out.println("Distancia dentro del límite.");
            return valor;
        }

    }



}
