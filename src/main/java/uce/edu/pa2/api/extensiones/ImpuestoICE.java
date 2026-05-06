package uce.edu.pa2.api.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Impuesto{

    @Override
    public double aplicarImpuesto(double valor) {

        System.out.print("Aplicando ICE 5% -> ");

        double valorFinal = valor * 1.05;

        System.out.println("Valor con ICE: " + valorFinal);
     
        return valorFinal;

    }

}
