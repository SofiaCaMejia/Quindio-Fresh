package org.example;

import java.util.ArrayList;

public class Pedido {
    private String ID;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private String direccionEnvio;
    private String notasEspeciales;
    private String codigoDescuento;

    public Pedido(String ID, Cliente cliente) {
        this.ID = ID;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }


}
