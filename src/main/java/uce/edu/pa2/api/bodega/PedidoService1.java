package uce.edu.pa2.api.bodega;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;

@Unremovable
@ApplicationScoped
public class PedidoService1 {

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");

    }
}