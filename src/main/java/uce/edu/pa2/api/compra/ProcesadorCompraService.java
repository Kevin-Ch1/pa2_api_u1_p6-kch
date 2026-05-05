package uce.edu.pa2.api.compra;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.Tarea4.Impuesto;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos;
    @Inject
    private Instance<Impuesto> impuestos;

    public void procesar(Compra compra) {
        double total = compra.getSubtotal();
        for (Descuento des : descuentos) {
            total = des.aplicar(total);
        }
        
        for (Impuesto imp : impuestos) {
            total = imp.aplicar(total);
        }
        compra.setTotal(total);
        System.out.println("Su valor a pagar es: " + compra.getTotal());
    }

}
