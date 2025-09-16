package org.example;

public class EnvioEstandar implements IEnvio {

    @Override
    public double calcularCosto(Pedido pedido) {
        // Ejemplo: costo fijo por envío estándar
        return 10.0;
    }

    @Override
    public boolean enviar(Pedido pedido) {
        System.out.println("El pedido " + pedido.getID() + " se envía por modalidad estándar.");
        return true;
    }
}
