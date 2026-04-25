package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService1 {

    @Inject
    private TrackingVenta trackingVenta;

    @Inject // Aqui como inyecto TrackingVenta se crea un objeto
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    public void procesar(Venta venta) {

        this.trackingVenta.iniciar();
        // Inicia la venta
        System.out.println("Procesado venta");
        // Consultando el stock de cada item
        // Consultando en la base de datos
        // finaliza venta
        // Voy a simular un tiempo
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.trackingVenta.finalizar();

        // Registrar estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }
}
