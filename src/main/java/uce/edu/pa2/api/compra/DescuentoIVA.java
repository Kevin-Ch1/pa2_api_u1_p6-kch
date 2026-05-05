package uce.edu.pa2.api.compra;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIVA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando IVA");
        double valorADescotar = valor * 0.15;
        return valor - valorADescotar;
        // return valor * 1.15;
    }

}
