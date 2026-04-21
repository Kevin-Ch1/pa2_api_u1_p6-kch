package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {

    @Inject
    private IVASingleton ivaSingleton;
    @Inject
    private IVAInject ivaInject;
    @Inject
    private IVAplicacion ivaAplicacion;

    public void imprimirObjetoIVA(double monto){
        System.out.println(this.ivaAplicacion);
        System.out.println(this.ivaAplicacion + " Cobrando: " + this.ivaAplicacion.aumentarIva(monto));
    }

    public void imprimirObjetoIVAInject(double monto){
        System.out.println(this.ivaInject);
        System.out.println(this.ivaInject + " Cobrando: " + this.ivaInject.aumentarIva(monto));
    }

    public void imprimirObjetoIVASingleton(double monto){
        System.out.println(this.ivaSingleton);
        System.out.println(this.ivaSingleton + " Cobrando: " + this.ivaSingleton.aumentarIva(monto));
    }

}
