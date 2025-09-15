package org.example;

public abstract class MetodoPago {
    public abstract  void procesarPago();
}


public class TarjetaCredito extends MetodoPago {
    @Override
    public void procesarPago() {
    }
}
    public class PSE extends MetodoPago {
        @Override
            public void procsarPago() {
        }
    }

