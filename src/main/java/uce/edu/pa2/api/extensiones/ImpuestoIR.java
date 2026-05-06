package uce.edu.pa2.api.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIR implements Impuesto{

    @Override
    public double aplicarImpuesto(double valor) {

        System.out.print("Aplicando IR 25% -> ");

        double valorFinal = valor * 1.25;

        System.out.println("Valor con IR: " + valorFinal);
     
        return valorFinal;


    }

}
