package uce.edu.pa2.api.Tarea4;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Impuesto {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ICE");
        double valorAIncrementar = valor * 0.35;
        return valor + valorAIncrementar;
    }
}
