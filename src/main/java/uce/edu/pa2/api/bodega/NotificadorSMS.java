package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el SMS al numero " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
