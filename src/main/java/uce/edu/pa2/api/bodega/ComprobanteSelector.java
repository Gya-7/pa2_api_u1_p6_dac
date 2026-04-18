package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    private ComprobanteFisico fisico;

    @Inject
    private ComprobantePDF pdf;

    public Comprobante seleccionar(String destino){

        if(destino == null){
            return fisico;

        } else {
            
            return pdf;
        }

    }



}
