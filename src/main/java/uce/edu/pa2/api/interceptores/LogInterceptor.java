package uce.edu.pa2.api.interceptores;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {

        System.out.println("Se ejecuto LOG antes del metodo");
        System.out.println("Interceptado el metodo: " + context.getMethod().getName());

        Object[] args = context.getParameters();

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento: " + args[i]);
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println(venta.getCliente());
            System.out.println(venta.getTotal());
        }

        System.out.println("\n");

        Object resultado = context.proceed();

        System.out.println("\n");
        System.out.println("Se ejecuto LOG DESPUES del metodo");

        return resultado;

    }

}
