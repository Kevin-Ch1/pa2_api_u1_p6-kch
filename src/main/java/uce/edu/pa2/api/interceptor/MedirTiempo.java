package uce.edu.pa2.api.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

// Se declara el interceptor
@InterceptorBinding // Con la anotación se declara que es un interceptor
@Target({ ElementType.METHOD, ElementType.TYPE }) // El objetivo, con method a nivel de metodo, con type es a nivel de clase
@Retention(RetentionPolicy.RUNTIME)
public @interface MedirTiempo {
    

}
