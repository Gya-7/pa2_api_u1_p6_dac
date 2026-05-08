package uce.edu.pa2.api.tarea5;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class CostoPorPeso implements Costo {

    @Override
    public double calcularValor(Paquete paquete, double valor) {

        System.out.println("Calculando costo por peso...");
        
        if (paquete.getPeso() > 5){

            double pesoExcedente = paquete.getPeso() - 5;
            System.out.println("Peso excedente: " + pesoExcedente + " kg, costo adicional: " + (pesoExcedente * 5));

            return  valor + (pesoExcedente * 5);
        } else {
            System.out.println("Peso dentro del límite.");
            return valor;
        }

    }

}
