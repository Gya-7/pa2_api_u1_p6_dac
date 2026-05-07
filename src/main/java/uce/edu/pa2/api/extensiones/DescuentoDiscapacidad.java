package uce.edu.pa2.api.extensiones;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class DescuentoDiscapacidad implements Descuento {

    @Override
    public double aplicar(double valor) {

        System.out.println("Aplicando DESCUENTO POR DISCAPACIDAD");

        double valorADescontar = valor * 0.35;
        return valor - valorADescontar;
    }

}
