package uce.edu.pa2.api.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.pa2.api.procesador.Venta;

@Log
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {
        System.out.println("Se ejecuto Log antes del método");
        System.out.println("Interceptado el método: " + context.getMethod().getName());
        Object[] args = context.getParameters();

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento: " + args[i]);
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println(venta.getCliente());
            System.out.println(venta.getTotal());
        }

        Object resultado = context.proceed();

        return resultado;
    }
}
