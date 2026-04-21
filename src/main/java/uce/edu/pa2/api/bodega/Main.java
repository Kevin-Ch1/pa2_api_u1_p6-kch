package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private IVAInject ivaInject;
        @Inject
        private IVASingleton ivaSingleton;
        @Inject
        private IVAplicacion ivaAplicacion;
        @Inject
        private ClaseIntermedia claseIntermedia;

        @Override
        public int run(String... args) {

            System.out.println("**************IVA Aplicacion: ********************");
            System.out.println(this.ivaAplicacion);
            System.out.println(this.ivaAplicacion.aumentarIva(100));
            this.ivaAplicacion.cambiarIva(0.05);
            this.claseIntermedia.imprimirObjetoIVA(100);
            System.out.println(this.ivaAplicacion.aumentarIva(100));

            System.out.println("**************IVA Inject: ********************");
            System.out.println(this.ivaInject);
            System.out.println(this.ivaInject.aumentarIva(100));
            this.ivaInject.cambiarIva(0.20);
            this.claseIntermedia.imprimirObjetoIVAInject(100);
            System.out.println(this.ivaInject.aumentarIva(100));

            System.out.println("**************IVA Singleton: ********************");
            System.out.println(this.ivaSingleton);
            System.out.println(this.ivaSingleton.aumentarIva(100));
            this.ivaSingleton.cambiarIva(0.10);
            this.claseIntermedia.imprimirObjetoIVASingleton(100);
            System.out.println(this.ivaSingleton.aumentarIva(100));
            

            return 0;
        }

    }
}
