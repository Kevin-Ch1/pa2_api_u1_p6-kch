package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.Procesador.EstadisticasVentasGlobales;
import uce.edu.pa2.api.Procesador.ProcesadorVentaEnLineaService;
import uce.edu.pa2.api.Procesador.ProcesadorVentaService;
import uce.edu.pa2.api.Procesador.ProcesadorVentaService1;
import uce.edu.pa2.api.Procesador.Venta;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaService procesadorVentaService;
        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;
        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;
        @Inject
        private ProcesadorVentaEnLineaService procesadorVentaEnLineaService;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Kevin Chicaiza", 70);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Ronald Guaman", 40);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Marco Polo", 20);
            this.procesadorVentaService.procesar(v3);

            Venta v4 = new Venta("Marco Polo", 20);
            this.procesadorVentaService1.procesar(v4);

            Venta v5 = new Venta("Marco Polo", 20);
            this.procesadorVentaService1.procesar(v5);

            Venta v6 = new Venta("Marco Polo", 20);
            this.procesadorVentaEnLineaService.procesar(v6);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }

    }
}
