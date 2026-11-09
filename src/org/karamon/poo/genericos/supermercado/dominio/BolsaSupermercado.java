package org.karamon.poo.genericos.supermercado.dominio;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private final int MAX_PRODUCTOS = 5;
    private final List<T> productos;
    private int indiceProductos;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProductos(T t) {
        if (this.productos.size() <= MAX_PRODUCTOS) {
            this.productos.add(t);
        } else {
            throw new RuntimeException("No hay más espacio...");
        }
    }
}
