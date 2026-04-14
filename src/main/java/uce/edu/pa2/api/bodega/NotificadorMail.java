package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Default //<- Se usa cuando se tiene algo por defecto
public class NotificadorMail implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el mail al correo " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
