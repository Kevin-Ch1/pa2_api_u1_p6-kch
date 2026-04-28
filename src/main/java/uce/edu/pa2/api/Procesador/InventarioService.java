package uce.edu.pa2.api.procesador;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.pa2.api.interceptor.MedirTiempo;

@ApplicationScoped
public class InventarioService {

    @MedirTiempo
    public void registrarInventario(){
        System.out.println("Registrando inventario");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin del registro del inventario");
    }

}
