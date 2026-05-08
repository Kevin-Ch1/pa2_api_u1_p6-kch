package uce.edu.pa2.api.pago;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import uce.edu.pa2.api.compra.Compra;

@ApplicationScoped
public class PagoService {

    @Inject
    private Instance<PagoEstrategia> estrategias;

    public void realizarPago(Compra compra) {

        for (PagoEstrategia estrategia : estrategias) {
            compra.setTotal(estrategia.realizar(compra));
            if (compra.getTotal() != 0) {
                System.out.printf("Valor restante: %,.2f%n", compra.getTotal());
            } else {
                break;
            }

        }

        System.out.println("Pago realizado, valor final: " + compra.getTotal());
    }

}
