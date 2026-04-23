package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.contenedor.NotificadorMail;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;
    @Inject
    private NotificadorSMS sms;
    @Inject
    private NotificadorWhatsapp wsp;

    public Notificador seleccionar(double total) {

        if (total > 120) {
            //MAIL
            return mail;
        } else if (total < 50){
            //WHATSAPP
            return wsp;
        } else {
            //SMS
            return sms;
        }

    }

}
