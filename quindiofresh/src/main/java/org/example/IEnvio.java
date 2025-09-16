package org.example;

public interface IEnvio {
    double calcularCosto(Pedido pedido);
    boolean enviar(Pedido pedido);
}
