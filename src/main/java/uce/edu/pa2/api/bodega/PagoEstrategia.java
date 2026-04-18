package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface PagoEstrategia {

    public void realizar (double valor);

}
