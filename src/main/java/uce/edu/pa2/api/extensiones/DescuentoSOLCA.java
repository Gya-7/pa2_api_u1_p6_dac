package uce.edu.pa2.api.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSOLCA implements Descuento{

    @Override
    public double aplicar(double valor) {

        System.out.println("Aplicando SOLCA");

        double valorADescontar = valor * 0.2;
        return valor - valorADescontar;
        
    }
}
