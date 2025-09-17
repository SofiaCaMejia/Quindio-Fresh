package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private String ID;
    private Date fechaCreacion;
    private Cliente cliente;
    private List<ItemPedido> items;
    private String direccionEnvio;
    private String notasEspeciales;
    private String codigoDescuento;
    private IEnvio envio;

    // 🔹 Constructor privado que usa el Builder
    private Pedido(Builder builder) {
        this.ID = builder.ID;
        this.fechaCreacion = builder.fechaCreacion;
        this.cliente = builder.cliente;
        this.items = builder.items;
        this.direccionEnvio = builder.direccionEnvio;
        this.notasEspeciales = builder.notasEspeciales;
        this.codigoDescuento = builder.codigoDescuento;
        this.envio = builder.envio; // ✅ ahora sí
    }

    // --- Getters ---
    public String getID() { return ID; }
    public Date getFechaCreacion() { return fechaCreacion; }
    public Cliente getCliente() { return cliente; }
    public List<ItemPedido> getItems() { return items; }
    public String getDireccionEnvio() { return direccionEnvio; }
    public String getNotasEspeciales() { return notasEspeciales; }
    public String getCodigoDescuento() { return codigoDescuento; }

    // --- Método para procesar envío ---
    public void procesarEnvio() {
        if (envio == null) {
            System.out.println("⚠ No se seleccionó método de envío.");
            return;
        }
        double costo = envio.calcularCosto(this);
        System.out.println("Costo del envío: $" + costo);
        envio.enviar(this);
    }

    @Override
    public String toString() {
        StringBuilder resumen = new StringBuilder("Pedido " + ID + " para " + cliente.getNombre() + "\n");
        for (ItemPedido item : items) {
            resumen.append("- ").append(item.getCantidad())
                    .append(" x ").append(item.getProducto().getNombre())
                    .append("\n");
        }
        return resumen.toString();
    }

    // --- Builder interno ---
    public static class Builder {
        private String ID;
        private Date fechaCreacion;
        private Cliente cliente;
        private List<ItemPedido> items = new ArrayList<>();
        private String direccionEnvio;
        private String notasEspeciales;
        private String codigoDescuento;
        private IEnvio envio; // ✅ faltaba

        // Constructor del builder (campos obligatorios)
        public Builder(String ID, Cliente cliente) {
            this.ID = ID;
            this.cliente = cliente;
            this.fechaCreacion = new Date();
        }

        // Métodos encadenables
        public Builder agregarItemPedido(Producto producto) {
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

        public Builder envio(IEnvio envio) {
            this.envio = envio;
            return this;
        }

        // Construir el Pedido
        public Pedido build() {
            return new Pedido(this);
        }
    }
}
