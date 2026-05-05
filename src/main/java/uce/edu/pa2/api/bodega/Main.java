package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.compra.Compra;
import uce.edu.pa2.api.compra.ProcesadorCompraService;


@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorCompraService compraService;

        @Override
        public int run(String... args) {
            Compra compra = new Compra("Kevin Chicaiza", 100.0);
            this.compraService.procesar(compra);
            return 0;
        }

    }
}
 