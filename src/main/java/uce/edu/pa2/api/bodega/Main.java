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
        private AmbitoAplicacion ambito;

        @Inject
        private ClaseIntermedia claseIntermedia;
        /*
         * @Inject
         * private AmbitoRequest ambitoRequest;
         */

        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String... args) {

            this.claseIntermedia.imprimirObjetoValor();

            System.out.println(this.ambito.incrementar());
            System.out.println(this.ambito.incrementar());
            System.out.println(this.ambito.incrementar());

            this.claseIntermedia.imprimirObjetoValor();

            /*
             * System.out.println("************AMBITO REQUEST*********");
             * System.out.println(this.ambitoRequest.incrementar());
             * System.out.println(this.ambitoRequest.incrementar());
             * System.out.println(this.ambitoRequest.incrementar());
             */

            System.out.println("************AMBITO DEPENDENT*********");
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());

            this.claseIntermedia.imprimirObjetoValorInject();

            System.out.println("************AMBITO SINGLETON*********");
            this.claseIntermedia.imprimirObjetoValorSingleton();
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());

            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }

    }
}
