package uce.edu.pa2.api.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoDiscapacidad implements Descuento{

    @Override
    public double aplicar(double valor) {

        System.out.println("Aplicando DESCUENTO POR DISCAPACIDAD");

        double valorADescontar = valor * 0.35;
        return valor - valorADescontar;
    }

}
