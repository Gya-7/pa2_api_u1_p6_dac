package uce.edu.pa2.api.tarea5;

public class Paquete {

    private String cliente;
    private double peso;
    private double distancia;
    private Double precioBase = 50.0;
    private Double precioFinal;
    private boolean primerPedido;

    public Paquete() {

    }

    public Paquete(String cliente, double peso, double distancia, boolean primerPedido) {
        this.cliente = cliente;
        this.peso = peso;
        this.distancia = distancia;
        this.primerPedido = primerPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public boolean isPrimerPedido() {
        return primerPedido;
    }
    public void setPrimerPedido(boolean primerPedido) {
        this.primerPedido = primerPedido;
    }
    


}
