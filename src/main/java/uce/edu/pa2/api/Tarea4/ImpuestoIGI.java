package uce.edu.pa2.api.Tarea4;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class ImpuestoIGI implements Impuesto {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando IGI");
        double valorAIncrementar = valor * 0.21;
        return valor + valorAIncrementar;
    }

}
