package org.example;
//el objetivo de esta clase es unir producto con la cantidad que se quiere de ese producto
public class ItemPedido {
    private Producto producto;
    private int cantidad;
    //constructor
    public ItemPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    //getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }
}
