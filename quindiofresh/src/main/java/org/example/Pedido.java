package org.example;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//problema a resolver esta clase tiene muchos atributos y algunos son opcionales entonces
// procedemos a utilizar el patron builder

public class Pedido {
    private String ID;
    private Date fechaCreacion;
    private Cliente cliente;
    private List<ItemPedido> items;
    private String direccionEnvio;
    private String notasEspeciales;
    private String codigoDescuento;

    //constructor privado
    private Pedido(Builder builder) {
        this.ID = builder.ID;
        this.fechaCreacion = builder.fechaCreacion;
        this.cliente = builder.cliente;
        this.items = builder.items;
        this.direccionEnvio = builder.direccionEnvio;
        this.notasEspeciales = builder.notasEspeciales;
        this.codigoDescuento = builder.codigoDescuento;
    }

    public String getID() {
        return ID;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public String getNotasEspeciales() {
        return notasEspeciales;
    }

    public String getCodigoDescuento() {
        return codigoDescuento;
    }

    @Override
    public String toString() {
        String resumen = "Pedido " + ID + " para " + cliente.getNombre() + "\n";
        for (ItemPedido item : items) {
            resumen += "- " + item.getCantidad() + " x " + item.getProducto().getNombre() + "\n";
        }
        return resumen;
    }

    //clase Builder interna
    public static class Builder {
        private String ID;
        private Date fechaCreacion;
        private Cliente cliente;
        private List<ItemPedido>items = new ArrayList<>();
        private String direccionEnvio;
        private String notasEspeciales;
        private String codigoDescuento;
    }
//constructor del builder
    public Builder(String ID, Cliente cliente) {
        this.ID = ID;
        this.cliente = cliente;
        this.fechaCreacion = new Date();//por defecto,sino le dan un valor explicito
        //se le asigna uno automaticamente para que el progama tenga sentido
    }

    public Builder agregarItemPedido(Producto producto, int cantidad) {
        this.items.add(new ItemPedido(producto, cantidad));
        return this;
    }

    public Builder direccionEnvio(String direccion) {
        this.direccionEnvio = direccion;
        return this;

    }

    public Builder notas(String notas) {
        this.notasEspeciales = notas;
        return this;
    }

    public Builder codigoDescuento(String codigo) {
        this.codigoDescuento = codigo;
        return this;
    }

    public Pedido build() {
        return new Pedido(this);
    }
}

