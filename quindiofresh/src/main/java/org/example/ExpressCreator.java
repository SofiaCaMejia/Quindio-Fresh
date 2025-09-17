package org.example;

public class ExpressCreator extends EnvioCreator {
    @Override
    public IEnvio crearEnvio() {
        return new EnvioExpress();
    }
}
