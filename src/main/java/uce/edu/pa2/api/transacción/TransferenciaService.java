package uce.edu.pa2.api.transacción;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TransferenciaService {
    
    @Inject
    private NotificadorPush notificadorPush;

    public void registrar(Transferencia transferencia) {
        System.out.println("Registrando transferencia");
        System.out.println("Cliente: " + transferencia.getCliente());
        System.out.println("Destinatario: " + transferencia.getDestinatario());
        System.out.println("Cantidad: " + transferencia.getCantidad());
        System.out.println("Cuenta: " + transferencia.getCuenta());
        System.out.println("Concepto: " + transferencia.getConcepto());
        System.out.println("Guardando en el registro");

        System.out.println("==========================");
        notificadorPush.enviar(transferencia.getCliente(), 
        "Se ha realizado una transferencia a " + transferencia.getDestinatario());
    }

}
