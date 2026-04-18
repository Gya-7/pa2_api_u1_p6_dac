package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements Comprobante{

    @Override
    public void comprobante(String destino){

        System.out.println("No se describio un destino");
        System.out.println("Imprimiendo comprobante fisico");


    }




}
