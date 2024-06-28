class SMSNotificacionUrgente extends NotificacionBase {
    public SMSNotificacionUrgente() {
        this.prioridad = "Alta";
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[URGENTE - ALTA PRIORIDAD] Enviando SMS: " + mensaje);
    }
}

class SMSNotificacionRegular extends NotificacionBase {
    public SMSNotificacionRegular() {
        this.prioridad = "Normal";
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[REGULAR - PRIORIDAD NORMAL] Enviando SMS: " + mensaje);
    }
}

class SMSNotificacion implements Notificacion {
    private String prioridad = "Normal";

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

    @Override
    public String obtenerPrioridad() {
        return prioridad;
    }
}