package uce.edu.pa2.api.pago;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.compra.Compra;

@ApplicationScoped
@Priority(1)
public class PagoEfectivo implements PagoEstrategia{

    private double valor = 30;

    @Override
    public double realizar(Compra compra) {
        if(compra.getTotal() == 0) return 0;

        System.out.println("Realizando pago en efectivo");
        System.out.println("Pagando: " + valor);

        return compra.getTotal() - valor;
    }
}
