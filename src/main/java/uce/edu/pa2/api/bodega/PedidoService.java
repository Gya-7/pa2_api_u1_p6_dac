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
    @Inject
    private ComprobanteSelector comprobantes;

    //Aqui el pago se hara como le dice el que lo llama
    public void registrar(Pedido pedido, PagoEstrategia pago) {

        System.out.println("---------------------------------------");
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        System.out.println("\n");
        System.out.println("PAGO");
        pago.realizar(pedido.getTotal());


        //NotificadorMail n1 = new NotificadorMail(); sin DI
        //Con DI por el contenedor
        System.out.println("\n");
        System.out.println("NOTIFICACION");
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), " -> Pedido registrado");

        System.out.println("\n");
        System.out.println("COMPROBANTE");
        Comprobante comprobante = this.comprobantes.seleccionar(pedido.getDestino());
        comprobante.comprobante(pedido.getDestino());

    }

}
