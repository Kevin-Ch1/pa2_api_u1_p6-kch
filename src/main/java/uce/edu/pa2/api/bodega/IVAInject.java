package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class IVAInject {
    private double valor = 0.15;

    public void cambiarIva(double valor){
        this.valor = valor;
    }

    public double aumentarIva(double valor){
        return valor + (this.valor * valor);
    }
}
