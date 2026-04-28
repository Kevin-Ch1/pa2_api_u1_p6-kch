package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.procesador.InventarioService;
import uce.edu.pa2.api.procesador.ProcesadorVentaServiceTiempo;
import uce.edu.pa2.api.procesador.Venta;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;
        @Inject
        private InventarioService inventarioService;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Kevin Chicaiza", 70);
            this.procesadorVentaServiceTiempo.procesar(v1);
            this.procesadorVentaServiceTiempo.reProcesar(v1);
            System.out.println("============================");
            this.inventarioService.registrarInventario();

            return 0;
        }

    }
}
