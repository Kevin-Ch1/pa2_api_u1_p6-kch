package uce.edu.pa2.api.comprobante;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    private ComprobantePDF pdf;
    
    @Inject
    private ComprobanteImpreso imp;

    public ComprobanteEstrategia selector(String destino){
        
        if(destino != null){
            return pdf;
        }else{
            return imp;
        }

    }
}
