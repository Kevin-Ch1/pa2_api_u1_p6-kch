package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.compra.Compra;
import uce.edu.pa2.api.compra.ProcesadorCompraService;
import uce.edu.pa2.api.pago.PagoService;


@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorCompraService compraService;
        @Inject
        private PagoService pagoService;

        @Override
        public int run(String... args) {
            Compra compra = new Compra("Kevin Chicaiza", 150.0);
            this.compraService.procesar(compra);
            System.out.println("============================================");
            System.out.println("Valor total de la compra: " + compra.getTotal());
            this.pagoService.realizarPago(compra);
            return 0;
        }

    }
}
 