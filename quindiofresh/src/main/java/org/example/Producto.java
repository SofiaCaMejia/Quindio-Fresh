package org.example;

public class Producto {
    private String  sku;
    private String  nombre;
    private double  precio;
//constructor
    public Producto(String sku, String nombre, double precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
    }
//get para leer los valores
    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
//para imprimir el producto
    @Override
    public String toString() {
        return sku + " - " + nombre + " - " + precio;
    }
}