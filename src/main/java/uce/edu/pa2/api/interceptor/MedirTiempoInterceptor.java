package uce.edu.pa2.api.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

// Vincula la clase con el interceptor
@MedirTiempo
@Interceptor
public class MedirTiempoInterceptor {
    
    @AroundInvoke // Le dice al método que se va ejecutar al rededor de un método
    public Object medir(InvocationContext context) throws Exception{
        System.out.println("Se ejecuto antes del método");
        long inicio = System.currentTimeMillis();

        // Se da la orden para que se ejecute método
        // Inicia la ejecución del método
        // Si no se llama al proceed, nunca se ejecuta el método
        Object resultado = context.proceed();
        // Pasa a la linea 17, una vez que se termine de ejecutar el método de negocio

        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido);
        return resultado;
    }
}
