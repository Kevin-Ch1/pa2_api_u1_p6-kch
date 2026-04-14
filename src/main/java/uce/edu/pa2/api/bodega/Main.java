package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.transacción.Transferencia;
import uce.edu.pa2.api.transacción.TransferenciaService;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService pedidoService;
        @Inject
        private TransferenciaService transferenciaService;

        @Override
        public int run(String... args) {
            Pedido pedido = new Pedido(
                    "Kevin Chicaiza",
                    "Mentas",
                    250,
                    "kevinCh@gmail.com");
            System.out.println("==========================");
            this.pedidoService.registrar(pedido);
            
            /*
            Transferencia trans = new Transferencia(
                    "Kevin Chicaiza",
                    "Maria Perez",
                    200,
                    "Cuenta 1234567890",
                    "Pago de pedido");
            System.out.println("==========================");
            this.transferenciaService.registrar(trans);
            */
            return 0;
        }

    }
}
