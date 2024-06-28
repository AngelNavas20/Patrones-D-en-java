abstract class NotificacionBase implements Notificacion {
    protected String prioridad;

    @Override
    public String obtenerPrioridad() {
        return prioridad;
    }
}