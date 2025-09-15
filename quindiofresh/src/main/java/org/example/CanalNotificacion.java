package org.example;

public abstract class CanalNotificacion {
    public abstract void enviarNotificacion();
}
public class NotificacionEmail extends CanalNotificacion {
    @Override
    public void enviarNotificacion() {

    }
}
public class NotificacionSMS extends CanalNotificacion{
    @Override
    public void enviarNotificacion() {

    }
}
