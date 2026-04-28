package uce.edu.pa2.api.pago;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo implements PagoEstrategia{

    @Override
    public void realizar(double valor) {
        System.out.println("Presenta la pantalla");
        System.out.println("Realizando cobro");
    }

    

}
