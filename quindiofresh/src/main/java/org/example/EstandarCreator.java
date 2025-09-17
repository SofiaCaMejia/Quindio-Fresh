package org.example;

public class EstandarCreator extends EnvioCreator {
    @Override
    public IEnvio crearEnvio() {
        return new EnvioEstandar();
    }
}
