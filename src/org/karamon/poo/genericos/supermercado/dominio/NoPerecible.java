package org.karamon.poo.genericos.supermercado.dominio;

public class NoPerecible extends Producto {
    private final int contenido;
    private final int calorias;

    public NoPerecible(int contenido, int calorias, String nombre, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
