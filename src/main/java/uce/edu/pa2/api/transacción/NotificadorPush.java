package uce.edu.pa2.api.transacción;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorPush {
    
    public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia la notificación push al cliente " + cliente);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
