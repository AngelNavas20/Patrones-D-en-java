class EmailNotificacionRegular extends NotificacionBase {
    public EmailNotificacionRegular() {
        this.prioridad = "Normal";
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[REGULAR - PRIORIDAD NORMAL] Enviando Email: " + mensaje);
    }
}

class EmailNotificacionUrgente extends NotificacionBase {
    public EmailNotificacionUrgente() {
        this.prioridad = "Alta";
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[URGENTE - ALTA PRIORIDAD] Enviando Email: " + mensaje);
    }
}
class EmailNotificacion implements Notificacion {
    private String prioridad = "Normal";

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }

    @Override
    public String obtenerPrioridad() {
        return prioridad;
    }
}