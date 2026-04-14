package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    
    /*
    // DI por atributo
    @Inject
    private NotificadorMail notificadorMail;
    
    // DI por constructor
    private NotificadorMail notificadorMail;

    @Inject
    public PedidoService(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    }

    // DI por metodo
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
        System.out.println("Total del pedido: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        // NotificadorMail n1 = new NotificadorMail(); Sin DI
        // Con DI por el contenedor
        System.out.println("==========================");
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido Registrado");

    }
}