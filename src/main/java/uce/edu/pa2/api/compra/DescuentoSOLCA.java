package uce.edu.pa2.api.compra;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(6)
public class DescuentoSOLCA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando SOLCA");
        double valorADescotar = valor * 0.20;
        return valor - valorADescotar;
    }

}
