package uce.edu.pa2.api.compra;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoImportacion implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Descuento de Importación");
        double valorADescotar = valor * 0.35;
        return valor - valorADescotar;
    }

}
