package org.example;

    public abstract class TipoEnvio {
        public abstract void calcularCosto();
}
    public class EnvioEstandar extends TipoEnvio{
    @Override
        public void calcularCosto() {
    }
}
public class EnvioExpress extends TipoEnvio {
        @Override
        public void calcularCosto() {

        }
}
