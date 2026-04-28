package uce.edu.pa2.api.notificador;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorWsp implements Notificador {

    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia whatsapp a: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }
    
}
