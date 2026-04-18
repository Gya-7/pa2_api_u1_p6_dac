package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF implements Comprobante{

    @Override
    public void comprobante(String destino) {

        System.out.println("Se describio un destino");
        System.out.println("Enviando pdf a " + destino);

    }


}
