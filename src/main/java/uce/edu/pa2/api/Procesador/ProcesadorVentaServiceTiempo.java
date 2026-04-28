package uce.edu.pa2.api.procesador;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.interceptor.MedirTiempo;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void procesar(Venta venta) {

        System.out.println("Procesado venta");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registrar estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Fin del pedido");
    }

    @MedirTiempo
    public void reProcesar(Venta venta) {

        System.out.println("Reprocesado venta");

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registrar estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Finalizando el reproceso");
    }
}
