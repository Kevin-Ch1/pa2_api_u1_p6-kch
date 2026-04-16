package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        // Modelos IoC
        // 1. DI
        @Inject
        private PedidoService pedidoService2;
        
        // 2. Service Locater (Lookup)
        // private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) {

            PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

            Pedido pedido = new Pedido(
                    "Kevin Chicaiza",
                    "Mentas",
                    250,
                    "kevinCh@gmail.com");
            System.out.println("==========================");
            pedidoService.registrar(pedido);
            
            Pedido pedido1 = new Pedido(
                    "Kevin Chicaiza",
                    "Mentas",
                    50,
                    "0999999999");
            System.out.println("==========================");
            pedidoService.registrar(pedido1);

            Pedido pedido2 = new Pedido(
                    "Kevin Chicaiza",
                    "Mentas",
                    30,
                    "0999999999");
            System.out.println("==========================");
            pedidoService.registrar(pedido2);
            
           
            return 0;
        }

    }
}

/*
 * Transferencia trans = new Transferencia(
 * "Kevin Chicaiza",
 * "Maria Perez",
 * 200,
 * "Cuenta 1234567890",
 * "Pago de pedido");
 * System.out.println("==========================");
 * this.transferenciaService.registrar(trans);
 */