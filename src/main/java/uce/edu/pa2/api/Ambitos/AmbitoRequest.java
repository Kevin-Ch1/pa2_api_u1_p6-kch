package uce.edu.pa2.api.ambitos;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class AmbitoRequest {
    private int contador = 0;

    public int incrementar(){
        return ++contador;
    } 
}
