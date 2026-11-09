package org.karamon.poo.genericos.supermercado.dominio;

public class Limpieza extends Producto {
    private final String componentes;
    private final double litros;

    public Limpieza(String componentes, double litros, String nombre, double precio) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }
}
