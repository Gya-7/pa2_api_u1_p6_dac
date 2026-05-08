package uce.edu.pa2.api.tarea5;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoPrimerPedido implements Descuento {

    @Override
    public double calcularValorDescuento(Paquete paquete, double valor) {

        System.out.println("Calculando descuento por primer pedido...");
        if (paquete.isPrimerPedido()) {
            System.out.println("El paquete es un primer pedido. Aplicando descuento del: 9%.");
            return valor * 0.9; 
        } else {
            System.out.println("El paquete no es un primer pedido.");
            return valor;
        }
    }

}
