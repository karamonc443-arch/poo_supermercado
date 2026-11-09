package org.karamon.poo.genericos.supermercado.dominio;

public class Lacteo extends Producto {
    private final int cantidad;
    private final int proteinas;

    public Lacteo(int cantidad, int proteinas, String nombre, double precio) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
