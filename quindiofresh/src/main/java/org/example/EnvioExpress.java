package org.example;

public class EnvioExpress implements IEnvio {

    @Override
    public double calcularCosto(Pedido pedido) {
        // Ejemplo: costo más alto para express
        return 25.0;
    }

    @Override
    public boolean enviar(Pedido pedido) {
        System.out.println("El pedido " + pedido.getID() + " se envía por modalidad express (24 horas).");
        return true;
    }
    
}
