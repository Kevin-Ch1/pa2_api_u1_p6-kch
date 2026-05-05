package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.compra.Descuento;

@ApplicationScoped
public class DescuentoISD implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        double valorADescontar = valor * 0.10;
        return valor - valorADescontar;
    }

}
