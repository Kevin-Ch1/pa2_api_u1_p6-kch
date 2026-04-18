package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF implements ComprobanteEstrategia {
    
    @Override
    public void enviar(String destino){
        System.out.println("Enviando el comprobante en PDF a: " + destino);
    }
}

