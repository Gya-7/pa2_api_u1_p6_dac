package uce.edu.pa2.api.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIVA implements Impuesto{

    @Override
    public double aplicarImpuesto(double valor) {

        System.out.print("Aplicando IVA 15% -> ");

        double valorFinal = valor * 1.15;

        System.out.println("Valor con IVA: " + valorFinal);

     
        return valorFinal;

    }

}
