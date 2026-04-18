package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
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
        private PedidoService pedidoService;
        
        // 2. Service Locater (Lookup)
        // private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();
        

        @Inject
        private PagoTarjetaCredito pagoTc;

        @Inject
        private PagoEfectivo pagoE;

        @Override
        public int run(String... args) {

            // Caso 1
            Pedido pedido = new Pedido(
                    "Kevin Chicaiza",
                    "Mentas",
                    250,
                    "kevinCh@gmail.com");
            System.out.println("==========================");
            this.pedidoService.registrar(pedido, pagoE);
            
            // Caso 2
            Pedido pedido1 = new Pedido(
                    "Kevin Chicaiza",
                    "Mentas",
                    250,
                    null);
            System.out.println("==========================");
            this.pedidoService.registrar(pedido1, pagoTc);

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