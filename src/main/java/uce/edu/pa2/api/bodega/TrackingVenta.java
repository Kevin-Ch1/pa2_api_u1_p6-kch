package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {
    private long tiempoInicio;

    private long tiempoFinal;

    public void iniciar(){
        this.tiempoInicio = this.tiempoInicio +  System.currentTimeMillis();
    }

    public void finalizar(){
        this.tiempoFinal = this.tiempoFinal + System.currentTimeMillis();
        long timepoEjecucion = tiempoFinal - this.tiempoInicio;
        System.out.println("Tiempo ejecución: " + timepoEjecucion + " ms");
    }
}
