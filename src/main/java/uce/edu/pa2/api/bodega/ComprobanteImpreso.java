package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteImpreso implements ComprobanteEstrategia {
    
    @Override
    public void enviar(String destino){
        System.out.println("Imprimiendo el comprobante" + destino);
    }
}

