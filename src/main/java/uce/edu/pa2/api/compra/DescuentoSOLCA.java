package uce.edu.pa2.api.compra;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSOLCA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando SOLCA");
        double valorADescotar = valor * 0.20;
        return valor - valorADescotar;
    }

}
