package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    /* 
    //DI POR CONSTRUCTOR
    private NotificadorMail notificadorMail;
    @Inject
    public PedidoService(NotificadorMail notificadorMail){
        this.notificadorMail = notificadorMail;
    }
     */
    //DI POR ATRIBUTO
    //@Inject
    //private NotificadorMail notificadorMail;
    //DI por metodo
    /* 
    private NotificadorMail notificadorMail;
    @Inject
    public void setNotificador(NotificadorMail notificadorMail){
        this.notificadorMail = notificadorMail;
        
    }
     */
    @Inject
    private NotificadorSelector selector;

    public void registrar(Pedido pedido) {

        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        //NotificadorMail n1 = new NotificadorMail(); sin DI
        //Con DI por el contenedor
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), " ->Pedido registrado");

    }

}
