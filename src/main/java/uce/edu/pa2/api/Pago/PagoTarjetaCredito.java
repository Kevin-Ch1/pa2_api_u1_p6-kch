package uce.edu.pa2.api.pago;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.compra.Compra;

@ApplicationScoped
@Priority(2)
public class PagoTarjetaCredito implements PagoEstrategia {

    @Override
    public double realizar(Compra compra) {
        if(compra.getTotal() == 0) return 0;

        System.out.println("Realizando pago con tarjeta de credito");
        return 0;
    }

}
