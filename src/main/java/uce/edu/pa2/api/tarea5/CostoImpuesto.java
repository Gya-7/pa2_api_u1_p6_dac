package uce.edu.pa2.api.tarea5;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class CostoImpuesto implements Costo {

    @Override
    public double calcularValor(Paquete paquete, double valor) {

        System.out.println("Calculando impuesto...");
        double total = valor + 20;
        System.out.println("El impuesto es: " + 20);
        return total; 
    }

}
