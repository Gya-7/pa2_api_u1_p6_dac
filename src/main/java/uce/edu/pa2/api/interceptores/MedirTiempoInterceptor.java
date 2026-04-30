package uce.edu.pa2.api.interceptores;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(2)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {

        System.out.println("Se ejecuto MEDIR TIEMPO antes del metodo");

        //Sirve para saber el metodo interceptado
        System.out.println("Metodo interceptado: " + context.getMethod().getName());

        long inicio = System.currentTimeMillis();

        //Inicia la ejecución del metodo
        //Si no se le llama nunca se ejecuta el metodo
        //Se ejecuta el interceptor pero no el metodo
        System.out.println("\n");
        Object resultado = context.proceed();
        //pasa a la linea 22 una vez que se termine de ejecutar el metodo de negocio
        System.out.println("\n");
        System.out.println("Se ejecuto despues del metodo");

        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;

        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido);

        //Aqui no se agrega sleep porque no quiero el tiempo del interceptor sino el tiempo del metodo
        return resultado; // esta parte no es obligatorio que retorne el resultado, y se puede adaptar

    }

}
