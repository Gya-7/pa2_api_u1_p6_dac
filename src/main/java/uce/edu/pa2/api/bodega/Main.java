package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.ambito.AmbitoAplicacion;
import uce.edu.pa2.api.ambito.AmbitoInject;
import uce.edu.pa2.api.ambito.AmbitoRequest;
import uce.edu.pa2.api.ambito.AmbitoSingleton;
import uce.edu.pa2.api.ambito.ClaseIntermedia;

public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication{

        @Inject
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoRequest ambitoRequest;
        
        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;
        

        @Override
        public int run (String... args){

            System.out.println("********** AMBITO APLICATION **********");
            
            System.out.println(ambitoAplicacion); //Se imprime el objeto

            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());
            

            this.claseIntermedia.imprimirObjetoValor();

            /*
            System.out.println("********** AMBITO REQUEST **********");
            System.out.println(this.ambitoRequest.incrementar());
            System.out.println(this.ambitoRequest.incrementar());
            System.out.println(this.ambitoRequest.incrementar());
             */

            System.out.println("********** AMBITO DEPENDENT **********");
            System.out.println(ambitoInject);
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());

            this.claseIntermedia.imprimirObjetoValorInject();

            System.out.println("********** AMBITO SINGLETON **********");
            System.out.println(ambitoSingleton);
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());

            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }

         
    }
}
