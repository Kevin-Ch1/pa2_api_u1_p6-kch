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

        @Inject
        private PedidoService pedidoService;

        @Override
        public int run(String... args) {
            Pedido pedido = new Pedido("Kevin Chicaiza", "Mentas", 200, "kevinCh@gmail.com");

            this.pedidoService.registrar(pedido);

            return 0;
        }

    }
}


