package uce.edu.pa2.api.interceptores;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {


    @MedirTiempo
    public void registrar(String pedido) {

        //inicia la venta
        System.out.println("Registrando inventario");
        //consultando el stock de cada item
        //consultando en la base de datos
        //finalizar venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(500);

        } catch (Exception e) {

        }

        System.out.println("Se registro: " + pedido);

        System.out.println(" -> INVENTARIO PROCESADO");

    }



}
