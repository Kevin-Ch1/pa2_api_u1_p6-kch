package uce.edu.pa2.api.Ambitos;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AmbitoAplicacion {
    private int contador = 0;

    public int incrementar(){
        return ++contador;
    } 
}
