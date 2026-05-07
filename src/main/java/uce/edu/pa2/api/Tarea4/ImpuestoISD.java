package uce.edu.pa2.api.Tarea4;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class ImpuestoISD implements Impuesto {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        double valorAIncrementar = valor * 0.05;
        return valor + valorAIncrementar;
    }

}
