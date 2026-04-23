package uce.edu.pa2.api.contenedor;

import jakarta.enterprise.context.ApplicationScoped;

//@unremovable con esta anotacion se le dice al contenedor que no elimine el bean pero se pierde la gestion del ciclo de vida del bean
@ApplicationScoped
public class PedidoService1 {

    public void registrar(Pedido pedido) {

        System.out.println("Registrando Pedido");

    }

}
